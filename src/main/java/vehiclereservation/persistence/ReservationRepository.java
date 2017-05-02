package vehiclereservation.persistence;

import org.springframework.stereotype.Repository;
import vehiclereservation.model.Reservation;

@Repository
public interface ReservationRepository extends org.springframework.data.repository.Repository<Reservation, Long> {

    Reservation save(Reservation reservation);
}
