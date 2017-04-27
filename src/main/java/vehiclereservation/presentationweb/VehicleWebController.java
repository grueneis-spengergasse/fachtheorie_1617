package vehiclereservation.presentationweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/web/vehicles")
public class VehicleWebController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView vehicles() {
        ModelAndView modelAndView = new ModelAndView("vehicles");
        return modelAndView;
    }
}
