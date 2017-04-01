package ro.ase.licenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by arnau on 12.02.2017.
 */

@Controller
public class Autenticate {
    @RequestMapping("/autenticate/login")
    public String login() {
        return "authenticate/login";
    }
}