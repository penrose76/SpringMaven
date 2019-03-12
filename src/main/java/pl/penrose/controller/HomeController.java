package pl.penrose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private ModelAndView model;

    @RequestMapping(value="/")
    public ModelAndView home(){

        model = new ModelAndView("home");
        model.addObject("testowy2","test54321");

        return model;
    }
}
