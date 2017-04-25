package vehiclereservation.service;

import vehiclereservation.model.Vehicle;
import vehiclereservation.persistence.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleReservationService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }
}
