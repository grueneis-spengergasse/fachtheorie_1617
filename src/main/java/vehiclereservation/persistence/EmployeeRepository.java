package vehiclereservation.persistence;

import org.springframework.stereotype.Repository;
import vehiclereservation.model.Employee;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
