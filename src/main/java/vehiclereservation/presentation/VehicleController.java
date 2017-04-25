package vehiclereservation.presentation;

import vehiclereservation.model.Vehicle;
import vehiclereservation.service.VehicleReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/cars")
public class VehicleController {

    @Autowired
    private VehicleReservationService vehicleReservationService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> cars() {
        return vehicleReservationService.findAllVehicles();
    }
}
