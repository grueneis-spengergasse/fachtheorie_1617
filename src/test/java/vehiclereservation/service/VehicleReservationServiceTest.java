package vehiclereservation.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vehiclereservation.model.Vehicle;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class VehicleReservationServiceTest {

    @Autowired
    private VehicleReservationService vehicleReservationService;

    @Test
    public void verifyFindAllVehicles() {
        List<Vehicle> vehicles = vehicleReservationService.findAllVehicles();

        assertThat(vehicles).isNotEmpty();
    }
}
