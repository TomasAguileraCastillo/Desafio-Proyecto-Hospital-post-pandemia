package cl.praxis.Desafio.Proyecto.Hospital.post.pandemia.model.services;


import cl.praxis.Desafio.Proyecto.Hospital.post.pandemia.model.dto.Patients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePatientsImpl implements ServicePatients {
    private List<Patients> p ;

    public ServicePatientsImpl(){

        p = new ArrayList<>();
        p.add(new Patients(1,"14093470-4","Cecilio","Stuart","Av siempre viva 742","654987321","CecilioLove@freake.com","Federico Stuart",998526311,"Taquicardia Severa"));
        p.add(new Patients(2,"15852963-4","Colombo","Jimenez","las delicias 456","321654987","MagnaJimenez@hotmail.com","Colombino II Jimenez",454512693, "Problema Respiratorio"));
        p.add(new Patients(3,"4562123-8","Sofio","Mayo","Conquistadores 654","45678913","DMayo@hotmail.com", "Jean Mayo",588596456,"Reservado N/D"));
        p.add(new Patients(4,"17456789-2","Cristiana","Dominguez","Antumala 5","258741936","CDominguez@ciniao.com","Albertina Dominguez",321654987,"Preparacion Alta"));

    }

    @Override
    public List<Patients> mostrarTodos() {
        return p ;
    }
}
