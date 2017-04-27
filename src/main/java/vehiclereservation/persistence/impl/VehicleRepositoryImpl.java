package vehiclereservation.persistence.impl;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import vehiclereservation.model.QReservation;
import vehiclereservation.model.QVehicle;
import vehiclereservation.model.Vehicle;
import vehiclereservation.persistence.VehicleRepositoryCustom;

import java.time.LocalDateTime;
import java.util.List;

public class VehicleRepositoryImpl extends QueryDslRepositorySupport
        implements VehicleRepositoryCustom {

    public VehicleRepositoryImpl() {
        super(Vehicle.class);
    }

    @Override
    public List<Vehicle> findAvailableVehicles(LocalDateTime dateFrom, LocalDateTime dateUntil) {
        QReservation qReservationStartsWithin = new QReservation("startsWithin");
        BooleanExpression startsWithin = JPAExpressions
                .select(qReservationStartsWithin)
                .from(qReservationStartsWithin)
                .where(qReservationStartsWithin.vehicle.eq(QVehicle.vehicle),
                        qReservationStartsWithin.dateFrom.before(dateFrom),
                        qReservationStartsWithin.dateTo.after(dateFrom))
                .notExists();

        QReservation qReservationEndsWithin = new QReservation("endsWithin");
        BooleanExpression endsWithin = JPAExpressions
                .select(qReservationEndsWithin)
                .from(qReservationEndsWithin)
                .where(qReservationEndsWithin.vehicle.eq(QVehicle.vehicle),
                        qReservationEndsWithin.dateFrom.before(dateUntil),
                        qReservationEndsWithin.dateTo.after(dateUntil))
                .notExists();

        QReservation qReservationSurrounds = new QReservation("surrounds");
        BooleanExpression surrounds = JPAExpressions
                .select(qReservationSurrounds)
                .from(qReservationSurrounds)
                .where(qReservationSurrounds.vehicle.eq(QVehicle.vehicle),
                        qReservationSurrounds.dateFrom.after(dateFrom),
                        qReservationSurrounds.dateTo.before(dateUntil))
                .notExists();

        JPQLQuery<Vehicle> vehicleQuery = from(QVehicle.vehicle)
                .where(startsWithin, endsWithin, surrounds);

        return vehicleQuery.fetch();
    }
}
