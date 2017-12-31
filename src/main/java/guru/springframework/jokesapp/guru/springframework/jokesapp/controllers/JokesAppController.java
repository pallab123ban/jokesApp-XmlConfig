package guru.springframework.jokesapp.guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.guru.springframework.jokesapp.services.JokesAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * This is the
 * @author PALLAB
 */
@Controller
@ControllerAdvice
public class JokesAppController {

    @Autowired
    JokesAppService jokesAppService;

    @RequestMapping(value="/get/joke", method = RequestMethod.GET)
    public String getRandomQuotes(Map<String, Object> model) {

        model.put("message", jokesAppService.getRandomJokes());

        return "chucknorris";
    }
}
