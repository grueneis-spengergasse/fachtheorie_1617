package vehiclereservation.persistence;

import org.springframework.stereotype.Repository;
import vehiclereservation.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>, VehicleRepositoryCustom {
}
