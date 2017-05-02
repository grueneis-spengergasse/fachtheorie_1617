package vehiclereservation.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vehiclereservation.model.Employee;
import vehiclereservation.model.Reservation;
import vehiclereservation.model.Vehicle;
import vehiclereservation.model.VehicleType;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class VerifyWorkflowEmployeeWithReservationTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Test
    @Transactional
    public void verifyWorkflowEmployeeWithReservation() {
        Employee employee = new Employee("Nicki", "Lauda", "1010");
        assertThat(employee.getId()).isNull();

        employee = employeeRepository.save(employee);
        assertThat(employee.getId()).isNotNull();

        Vehicle vehicle = Vehicle.builder()
                .vehicleType(VehicleType.KOMBI)
                .numberPlate("W-1111AB")
                .build();
        vehicle = vehicleRepository.save(vehicle);
        assertThat(vehicle.getId()).isNotNull();

        Reservation reservation = new Reservation(employee, vehicle, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        reservationRepository.save(reservation);
    }
}
