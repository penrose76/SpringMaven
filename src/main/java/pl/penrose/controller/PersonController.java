package pl.penrose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.penrose.dao.PersonDao;
import pl.penrose.model.Person;

import javax.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonController {


    //private PersonDao personDao;

    @RequestMapping("/add")
    public ModelAndView add(Person person) {

        ModelAndView modelAndView = new ModelAndView("add");

        modelAndView.addObject("person", person);
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@Valid Person person, BindingResult bindingResult) {

        ModelAndView modelAndView = new ModelAndView("save");

        modelAndView.addObject("person", person);

        if (bindingResult.hasErrors()) {
            System.out.println("Znalezione błędy");
            return new ModelAndView("add");
        }

        //personDao.save(person);

        return modelAndView;
    }




}
