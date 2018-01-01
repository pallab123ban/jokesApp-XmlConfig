package guru.springframework.jokesapp.guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.guru.springframework.jokesapp.services.JokesAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This is the controller class
 *
 * @author PALLAB
 */
@Controller
@ControllerAdvice
public class JokesAppController {

    private JokesAppService jokesAppService;

    @Autowired
    public JokesAppController(JokesAppService jokesAppService) {
        this.jokesAppService = jokesAppService;
    }

    @RequestMapping(value = "/get/joke", method = RequestMethod.GET)
    public String getRandomQuotes(Model model) {
        model.addAttribute("message", jokesAppService.getRandomJokes());
        return "chucknorris";
    }
}
