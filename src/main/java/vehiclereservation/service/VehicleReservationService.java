package vehiclereservation.service;

import vehiclereservation.model.Employee;
import vehiclereservation.model.Reservation;
import vehiclereservation.model.Vehicle;
import vehiclereservation.persistence.EmployeeRepository;
import vehiclereservation.persistence.ReservationRepository;
import vehiclereservation.persistence.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleReservationService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Employee findOneEmployee(Long employeeId) {
        return employeeRepository.findOne(employeeId);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Reservation> findReservationsByEmployee(Long employeeId) {
        Employee employee = employeeRepository.findOne(employeeId);
        return employee.getReservations();
    }

    public Reservation addReservationForEmployee(Long employeeId, Reservation reservation) {
        Employee employee = employeeRepository.findOne(employeeId);
        employee.addReservation(reservation);
        reservationRepository.save(reservation);
        return reservation;
    }
}
