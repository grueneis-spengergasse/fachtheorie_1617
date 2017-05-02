package vehiclereservation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Reservation extends AbstractPersistable<Long> {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Vehicle vehicle;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Employee employee;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public Reservation(Employee employee, Vehicle vehicle, LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.vehicle = vehicle;
        this.employee = employee;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    protected void setEmployee(Employee employee) {
        this.employee = employee;
        if (!employee.containsReservation(this)) {
            employee.addReservation(this);
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        if (!vehicle.containsReservation(this)) {
            vehicle.addReservation(this);
        }
    }
}
