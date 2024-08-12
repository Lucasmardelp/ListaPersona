package com.listaPersonas.Cuadricula.que.enlista.Personas.entidad;

import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Distritos;
import com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion.Sexo;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
public class Persona {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private String id;

    private String nombre;
    private String apellido;
    private String email;
    private String domicilio;
    private LocalDate edad;
    @Enumerated(EnumType.STRING)
    private Distritos distritos;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, String email, String domicilio, LocalDate edad, Distritos distritos, Sexo sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.domicilio = domicilio;
        this.edad = edad;
        this.distritos = distritos;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Distritos getDistritos() {
        return distritos;
    }

    public void setDistritos(Distritos distritos) {
        this.distritos = distritos;
    }
}
