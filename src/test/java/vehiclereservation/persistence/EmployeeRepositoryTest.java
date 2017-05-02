package vehiclereservation.persistence;

import org.springframework.test.context.junit4.SpringRunner;
import vehiclereservation.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void verifyDataFromScript() {
        Iterable<Employee> all = employeeRepository.findAll();

        assertThat(all).isNotEmpty().hasSize(3);
    }

    @Test
    public void verifyCreateNewEmployee() {
        Employee employee = new Employee("Hans", "Maier", "4711");
        assertThat(employee.getId()).isNull();

        employeeRepository.save(employee);

        assertThat(employee.getId()).isNotNull();
    }
}
