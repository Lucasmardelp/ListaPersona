package com.listaPersonas.Cuadricula.que.enlista.Personas.servicio;

import com.listaPersonas.Cuadricula.que.enlista.Personas.entidad.Persona;
import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Distritos;
import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Sexo;
import com.listaPersonas.Cuadricula.que.enlista.Personas.excepcion.MiExcepcion;
import com.listaPersonas.Cuadricula.que.enlista.Personas.repositorio.PersonaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

@Transactional
public void crearPersona(String nombre, String apellido, String email, String domicilio, Distritos distritos, Sexo sexo, LocalDate edad) throws MiExcepcion{

    validarCrearPersona(nombre,apellido,email,domicilio);
    Persona persona = new Persona();
    persona.setNombre(nombre);
    persona.setApellido(apellido);
    persona.setEmail(email);
    persona.setDomicilio(domicilio);
    persona.setDistritos(distritos);
    persona.setSexo(sexo);
    persona.setEdad(edad);
    System.out.println("Existo");
    personaRepositorio.save(persona);
}

    public void validarCrearPersona( String nombre,String apellido, String email, String domicilio) throws MiExcepcion {

        System.out.println("HOLLLLLLLLLLLLLLLLLLLLLLLLAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        if (nombre.isEmpty() || nombre == null) {
            throw new MiExcepcion("El nombre no puede estar vacío, o es incorrecto");
        }

        if (apellido.isEmpty() || apellido == null ){
            throw  new MiExcepcion("El apellido no puede estar vacío, o es incorrecto");
        }

        if (email.isEmpty() || email == null) {
            throw new MiExcepcion("El email no puede estar vacío");
        }

        if (domicilio.isEmpty() || domicilio == null) {
            throw new MiExcepcion("El campo domicilio no puede estar vacio");
        }




    }

    @Transactional
    public void borrarPersonaPorId(String idPerona) {
        Optional<Persona> respuesta = personaRepositorio.findById(idPerona);
        if (respuesta.isPresent()) {
            personaRepositorio.deleteById(idPerona);
        }

    }


    public List<Persona> listadoPersonas() {
        List<Persona> personaAux = new ArrayList<>();
        personaAux = personaRepositorio.findAll();
        return personaAux;
    }





    }
