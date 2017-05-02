package vehiclereservation.presentationrest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import vehiclereservation.model.Vehicle;
import vehiclereservation.service.VehicleReservationService;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VehicleRestController.class)
public class VehicleRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VehicleReservationService vehicleReservationService;

    @Test
    public void verifyFindAllVehicles() throws Exception {
        List<Vehicle> vehicles = Arrays.asList(new Vehicle(), new Vehicle(), new Vehicle());
        given(vehicleReservationService.findAllVehicles()).willReturn(vehicles);

        mockMvc.perform(get("/api/vehicles"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(vehicles.size())));
    }
}
