package vehiclereservation.model;

import lombok.Getter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Employee extends AbstractPersistable<Long> {

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Getter
    private String svnr;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.PERSIST)
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.PERSIST)
    private List<Trip> trips = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstName, String lastName, String svnr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.svnr = svnr;
    }

    public List<Reservation> getReservations() {
        return Collections.unmodifiableList(reservations);
    }

    public void addReservation(Reservation reservation) {
        if (reservation != null) {
            reservations.add(reservation);
            if (reservation.getEmployee() == null || !reservation.getEmployee().equals(this)) {
                reservation.setEmployee(this);
            }
        }
    }

    protected boolean containsReservation(Reservation reservation) {
        return reservations.contains(reservation);
    }

    public List<Trip> getTrips() {
        return Collections.unmodifiableList(trips);
    }

    public void addTrip(Trip trip) {
        if (trip != null) {
            trips.add(trip);
            if (trip.getEmployee() == null || !trip.getEmployee().equals(this)) {
                trip.setEmployee(this);
            }
        }
    }

    protected boolean containsTrip(Trip trip) {
        return trips.contains(trip);
    }
}
