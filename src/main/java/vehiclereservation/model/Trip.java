package vehiclereservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Trip extends AbstractPersistable<Long> {

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Vehicle vehicle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Employee employee;

    @Getter
    private LocalDateTime startDate;
    @Getter
    private LocalDateTime endDate;
    @Getter
    private Double kmBegin;
    @Getter
    private Double kmEnd;

    public void setEmployee(Employee employee) {
        this.employee = employee;
        if (!employee.containsTrip(this)) {
            employee.addTrip(this);
        }
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        if (!vehicle.containsTrip(this)) {
            vehicle.addTrip(this);
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
