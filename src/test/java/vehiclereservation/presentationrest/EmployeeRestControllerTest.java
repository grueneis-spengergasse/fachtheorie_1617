package vehiclereservation.presentationrest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import vehiclereservation.model.Employee;
import vehiclereservation.model.Reservation;
import vehiclereservation.service.VehicleReservationService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeRestController.class)
public class EmployeeRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @MockBean
    private VehicleReservationService vehicleReservationService;

    @Test
    public void verifyFindAllEmployees() throws Exception {
        List<Employee> employees = Arrays.asList(new Employee(), new Employee(), new Employee());
        given(vehicleReservationService.findAllEmployees()).willReturn(employees);

        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(employees.size())));
    }

    @Test
    public void verifyPostNewEmployee() throws Exception {
        String employeeAsJson = jacksonObjectMapper.writeValueAsString(new Employee("Hugo", "Meier", "1140"));
        given(vehicleReservationService.saveEmployee(any())).willReturn(new Employee());

        mockMvc.perform(post("/api/employees").content(employeeAsJson).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());

        verify(vehicleReservationService).saveEmployee(any(Employee.class));
    }

    @Test
    public void verifyGetReservations() throws Exception {
        Employee employee = new Employee("Hansi", "Meyer", "1050");
        List<Reservation> reservations = Arrays.asList(new Reservation[]{
                new Reservation(employee, null, LocalDateTime.now(), LocalDateTime.now().plusHours(1)),
                new Reservation(employee, null, LocalDateTime.now(), LocalDateTime.now().plusHours(2)),
                new Reservation(employee, null, LocalDateTime.now(), LocalDateTime.now().plusHours(3))
        });

        given(vehicleReservationService.findReservationsByEmployee(1l)).willReturn(reservations);

        mockMvc.perform(get("/api/employees/1/reservations"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)));
    }
}
