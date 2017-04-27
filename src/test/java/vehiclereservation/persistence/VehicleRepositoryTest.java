package vehiclereservation.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vehiclereservation.model.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    public void verifyFindAvailableVehicles() {

        List<Vehicle> availableVehicles = vehicleRepository.findAvailableVehicles(LocalDateTime.MIN, LocalDateTime.MAX);

        assertThat(availableVehicles).isNotEmpty();
    }
}
