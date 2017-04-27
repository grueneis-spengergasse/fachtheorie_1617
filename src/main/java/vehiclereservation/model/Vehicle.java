package vehiclereservation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
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

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private List<Trip> trips;
}
