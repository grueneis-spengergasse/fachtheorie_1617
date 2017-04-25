package vehiclereservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Employee extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;
    private String svnr;

    @OneToMany(mappedBy = "employee")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "employee")
    private List<Trip> trips;
}
