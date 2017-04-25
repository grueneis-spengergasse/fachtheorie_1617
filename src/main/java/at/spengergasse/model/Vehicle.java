package at.spengergasse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Vehicle extends AbstractPersistable<Long> {

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private String brand;
    private String model;
    private String numberPlate;
    private Integer seatNr;
    private Double km;
    private Double basicPrice;
    private Integer includedKm;
    private Double pricePer100Km;
    private Double penaltyPerDay;

    @OneToMany(mappedBy = "vehicle")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "vehicle")
    private List<Trip> trips;
}
