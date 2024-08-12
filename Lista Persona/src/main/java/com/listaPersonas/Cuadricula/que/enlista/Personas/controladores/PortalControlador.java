package com.listaPersonas.Cuadricula.que.enlista.Personas.controladores;

import com.listaPersonas.Cuadricula.que.enlista.Personas.entidad.Persona;
import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Distritos;
import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Sexo;
import com.listaPersonas.Cuadricula.que.enlista.Personas.excepcion.MiExcepcion;
import com.listaPersonas.Cuadricula.que.enlista.Personas.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping("/")
    public String inicio(ModelMap modelo) {
        List<Distritos> distritos = Arrays.asList(Distritos.values());
        List<Sexo> sexo = Arrays.asList(Sexo.values());
        modelo.put("distrito", distritos);
        modelo.put("sexo", sexo);
        return "index";
    }


    @PostMapping("/agregarPersona")
    public String agregarPersona(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String email, @RequestParam String domicilio, @RequestParam Distritos distritos, @RequestParam Sexo sexo, @RequestParam(required = false) LocalDate edad, RedirectAttributes redirectAttributes) throws  MiExcepcion {

        try {
            personaServicio.crearPersona(nombre, apellido, email, domicilio, distritos, sexo, edad);
            redirectAttributes.addFlashAttribute("exito", "Perfil de persona  creada");
        } catch (MiExcepcion ex) {
            System.out.println("Entre aquí");
            redirectAttributes.addFlashAttribute("error", ex.getMessage());
            redirectAttributes.addFlashAttribute("nombre", nombre);
            redirectAttributes.addFlashAttribute("apellido", apellido);
            redirectAttributes.addFlashAttribute("email", email);
            List<Distritos> distritos1 = Arrays.asList(Distritos.values());
            List<Sexo> sexos = Arrays.asList(Sexo.values());
            System.out.println("FINAL BOXXX");
            return "redirect:/";
        }
        return "redirect:/listaPersona";
    }


    @GetMapping("listaPersona")
    public String listadoPersona(ModelMap modelo) {
        List<Persona> personas = personaServicio.listadoPersonas();
        modelo.addAttribute("persona", personas);
        return "listaPersona";
    }

    @PostMapping("/eliminarPersona/{id}")
    public String eliminarPersona(@PathVariable String id, RedirectAttributes redirectAttributes ){
        try {
            personaServicio.borrarPersonaPorId(id);
            redirectAttributes.addFlashAttribute("exito", "Persona eliminada exitosamente. ");
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("error", "No se puedo eliminar la persona");
        }
        return "redirect:/listaPersona";
    }


}
