package vehiclereservation.presentationrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vehiclereservation.model.Employee;
import vehiclereservation.model.Reservation;
import vehiclereservation.service.VehicleReservationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeRestController {

    @Autowired
    private VehicleReservationService vehicleReservationService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ResponseEntity.ok(vehicleReservationService.findAllEmployees());
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> findEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(vehicleReservationService.findOneEmployee(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid Employee employee, HttpServletRequest request) {
        vehicleReservationService.saveEmployee(employee);
        return ResponseEntity.created(URI.create(request.getRequestURL().append("/").append(employee.getId()).toString())).build();
    }

    @RequestMapping(path = "{id}/reservations", method = RequestMethod.GET)
    public ResponseEntity<List<Reservation>> findReservationsByEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(vehicleReservationService.findReservationsByEmployee(id));
    }

    @RequestMapping(path = "{id}/reservations", method = RequestMethod.POST)
    public ResponseEntity<Reservation> addReservationForEmployee(@PathVariable Long id, @RequestBody @Valid Reservation reservation) {
        return ResponseEntity.ok(vehicleReservationService.addReservationForEmployee(id, reservation));
    }
}
