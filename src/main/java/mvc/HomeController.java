package mvc;

import jpa.BeanEntityDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
public class HomeController {

    private BeanEntityDAO beanEntityDAO;

    @Inject
    public HomeController(BeanEntityDAO beanEntityDAO) {
        this.beanEntityDAO = beanEntityDAO;
    }

    @RequestMapping({"/", "/home"})
    public String showForm() {
        return "home";
    }
}
