package at.spengergasse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Trip extends AbstractPersistable<Long> {

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Employee employee;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double kmBegin;
    private Double kmEnd;
}
