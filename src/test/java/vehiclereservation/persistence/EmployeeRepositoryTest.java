package vehiclereservation.persistence;

import vehiclereservation.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void verifyDataFromScript() {
        Iterable<Employee> all = employeeRepository.findAll();

        assertThat(all).isNotEmpty().hasSize(3);
    }
}
