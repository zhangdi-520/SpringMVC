package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/ok",method= RequestMethod.GET)
    public String home(){
        System.out.println("2");
        return "home";
    }
}
