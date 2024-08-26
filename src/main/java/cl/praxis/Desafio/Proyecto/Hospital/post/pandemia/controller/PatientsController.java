package cl.praxis.Desafio.Proyecto.Hospital.post.pandemia.controller;

import cl.praxis.Desafio.Proyecto.Hospital.post.pandemia.DesafioProyectoHospitalPostPandemiaApplication;
import cl.praxis.Desafio.Proyecto.Hospital.post.pandemia.model.services.ServicePatients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PatientsController {

    private static final Logger log = LoggerFactory.getLogger(DesafioProyectoHospitalPostPandemiaApplication.class);
    private ServicePatients servicePatients;

    public PatientsController(ServicePatients servicePatients) {
        this.servicePatients = servicePatients;
    }

    @GetMapping
    public String mostrarPacietes(Model model){
        log.info("Inicio de Ejecucion MostrarPacientes ");
        model.addAttribute("listaPacientes", servicePatients.mostrarTodos() );
        return "listadoPacientes";
    }
}
