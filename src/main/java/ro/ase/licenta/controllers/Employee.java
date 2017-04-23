package ro.ase.licenta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.ase.licenta.domain.*;
import ro.ase.licenta.services.*;

import java.text.DateFormat;
import java.util.List;

/**
 * Created by arnau on 26.02.2017.
 */
@Controller
public class Employee {

    @Autowired
    AngajatiService angajatiService;

    @Autowired
    CvService cvService;

    @Autowired
    ConsultatiiMedicaleService consultatiiMedicaleService;

    @Autowired
    CursantiService cursantiService;

    @Autowired
    CursuriService cursuriService;

    @Autowired
    DepartamenteService departamenteService;

    @Autowired
    EducatieService educatieService;

    @Autowired
    ExperientaService experientaService;

    @Autowired
    FunctiiService functiiService;

    @Autowired
    LoginService loginService;

    @Autowired
    PlanificareConcediiService planificareConcediiService;

    @Autowired
    ProgramareCursuriService programareCursuriService;

    @RequestMapping("/employee/profile")
    public String profile() {
        return "employee/profile";
    }

    @RequestMapping("/employee/concedii")
    public String concedii() {
        return "employee/concedii";
    }

    @RequestMapping("/employee/cursuri")
    public String cursuri() {
        return "employee/cursuri";
    }

    @RequestMapping("/employee/consultatiiMedicale")
    public String consultatiiMedicale() {
        return "employee/consultatiiMedicale";
    }

    @RequestMapping("/empoyee/list")
    @ResponseBody
    public List<Angajati> list() {
        return angajatiService.findAll();
    }

    @RequestMapping("/employee/posturi")
    public String posturi() {
        return "employee/posturi";
    }


    @RequestMapping(value="/employee/{employeeId}/cv", method=RequestMethod.GET)
    public String cv(@PathVariable int employeeId, Model model) {
        Cv cv = cvService.getCv(employeeId);
        Educatie educatie = educatieService.getEducatie(employeeId);
        Experienta experienta = experientaService.getExperienta(employeeId);
        model.addAttribute("cv", cv);
        model.addAttribute("educatie", educatie);
        model.addAttribute("experienta", experienta);

        return "employee/cv";
    }

    @RequestMapping(value="/employee/{cursantiId}/cursanti", method=RequestMethod.GET)
    public String cursanti(@PathVariable int cursantiId, Model model) {
        Cursanti cursanti = cursantiService.getCursanti(cursantiId);
        model.addAttribute("cursanti", cursanti);

        return "employee/cursanti";
    }


    @RequestMapping("/employee/consultatiimedicalelist")
    @ResponseBody
    public List<ConsultatiiMedicale> listConsultatii() {
        return consultatiiMedicaleService.findAll();
    }

    @RequestMapping("/employee/cursuriList")
    @ResponseBody
    public List<Cursuri> listCursuri() {
        return cursuriService.findAll();
    }

    @RequestMapping("/employee/departamenteList")
    @ResponseBody
    public List<Departamente> listDepartamente() {
        return departamenteService.findAll();
    }

    @RequestMapping("/employee/functiiList")
    @ResponseBody
    public List<Functii> listFunctii() {
        return functiiService.findAll();
    }

    @RequestMapping("/employee/loginList")
    @ResponseBody
    public List<Login> listLogin() {
        return loginService.findAll();
    }

    @RequestMapping("/employee/planificareConcediiList")
    @ResponseBody
    public List<PlanificareConcedii> listPlanificareConcedii() {
        return planificareConcediiService.findAll();
    }

    @RequestMapping("/employee/programareCursuriList")
    @ResponseBody
    public List<ProgramareCursuri> listProgramareCursuri() {
        return programareCursuriService.findAll();
    }


}
