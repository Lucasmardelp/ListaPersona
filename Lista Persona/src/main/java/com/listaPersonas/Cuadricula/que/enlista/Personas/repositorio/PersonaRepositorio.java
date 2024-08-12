package com.listaPersonas.Cuadricula.que.enlista.Personas.repositorio;

import com.listaPersonas.Cuadricula.que.enlista.Personas.entidad.Persona;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepositorio  extends JpaRepository<Persona, String> {

    @Query("SELECT u FROM Persona u WHERE u.nombre LIKE :nombre")
    public List<Persona> buscaUsuarioPorNombre(@Param("nombre")String nombre);

    @Query ("SELECT u FROM Persona u WHERE u.email LIKE :email")
    public Persona buscaUsuarioPorEmail(@Param("email")String email);




}
