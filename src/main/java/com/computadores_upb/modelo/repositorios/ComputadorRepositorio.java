package com.computadores_upb.modelo.repositorios;

import com.computadores_upb.modelo.entidades.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComputadorRepositorio extends JpaRepository<Computador, Long> {

    @Query(value = "select * from computador",nativeQuery = true)
    List<Computador> traerTodosComputador();

    @Query(value = "select * from computador where id=:id",nativeQuery = true)
    Computador traerUnComputadorporId(@Param("id") Long id);

}
