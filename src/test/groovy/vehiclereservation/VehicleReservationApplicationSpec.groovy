package vehiclereservation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration
@SpringBootTest
class VehicleReservationApplicationSpec extends Specification {

    @Autowired
    ApplicationContext context

    def "should boot up without errors"() {
        expect: "web application context exists"
        context != null
    }
}
