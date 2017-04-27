package vehiclereservation.persistence;

import org.springframework.data.repository.NoRepositoryBean;
import vehiclereservation.model.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

@NoRepositoryBean
public interface VehicleRepositoryCustom {

    List<Vehicle> findAvailableVehicles(LocalDateTime dateFrom, LocalDateTime dateUntil);
}
