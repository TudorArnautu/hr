package ro.ase.licenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arnau on 01.04.2017.
 */
@Controller
public class Manager {

    @RequestMapping("/manager/raport")
    public String manager() {
        return "manager/raport";
    }
}
