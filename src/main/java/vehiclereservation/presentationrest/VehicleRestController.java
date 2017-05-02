package vehiclereservation.presentationrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vehiclereservation.model.Vehicle;
import vehiclereservation.service.VehicleReservationService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/vehicles")
public class VehicleRestController {

    @Autowired
    private VehicleReservationService vehicleReservationService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> findAllVehicles() {
        return vehicleReservationService.findAllVehicles();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Vehicle saveVehicle(@Valid Vehicle vehicle) {
        return vehicleReservationService.saveVehicle(vehicle);
    }
}
