package vehiclereservation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Vehicle extends AbstractPersistable<Long> {

    @Getter
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    @Getter
    private String brand;
    @Getter
    private String model;
    @Getter
    private String numberPlate;
    @Getter
    private Integer seatNr;
    @Getter
    private Double km;
    @Getter
    private Double basicPrice;
    @Getter
    private Integer includedKm;
    @Getter
    private Double pricePer100Km;
    @Getter
    private Double penaltyPerDay;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Reservation> reservations = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Trip> trips = new ArrayList<>();

    protected boolean containsReservation(Reservation reservation) {
        return reservations.contains(reservation);
    }

    public void addReservation(Reservation reservation) {
        if (reservation != null) {
            reservations.add(reservation);
            if (reservation.getVehicle() == null || !reservation.getVehicle().equals(this)) {
                reservation.setVehicle(this);
            }
        }
    }

    public List<Reservation> getReservations() {
        return Collections.unmodifiableList(reservations);
    }

    protected boolean containsTrip(Trip trip) {
        return trips.contains(trip);
    }

    public void addTrip(Trip trip) {
        if (trip != null) {
            trips.add(trip);
            if (trip.getVehicle() == null || !trip.getVehicle().equals(this)) {
                trip.setVehicle(this);
            }
        }
    }

    public List<Trip> getTrips() {
        return Collections.unmodifiableList(trips);
    }
}
