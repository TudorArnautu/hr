package ro.ase.licenta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.ase.licenta.domain.*;
import ro.ase.licenta.services.*;

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

    @RequestMapping("/employee/cv")
    public String cv() {
        return "employee/cv";
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

    @RequestMapping("/employee/posturi")
    public String posturi() {
        return "employee/posturi";
    }

    @RequestMapping("/empoyee/list")
    @ResponseBody
    public List<Angajati> list() {
        return angajatiService.findAll();
    }

    @RequestMapping("/employee/cvlist")
    @ResponseBody
    public List<Cv> listCv() {
        return cvService.findAll();
    }

    @RequestMapping("/employee/consultatiimedicalelist")
    @ResponseBody
    public List<ConsultatiiMedicale> listConsultatii() {
        return consultatiiMedicaleService.findAll();
    }

    @RequestMapping("/employee/cursantiList")
    @ResponseBody
    public List<Cursanti> listCursanti() {
        return cursantiService.findAll();
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

    @RequestMapping("/employee/educatieList")
    @ResponseBody
    public List<Educatie> listEducatie() {
        return educatieService.findAll();
    }

    @RequestMapping("/employee/experientaList")
    @ResponseBody
    public List<Experienta> listExperienta() {
        return experientaService.findALl();
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
