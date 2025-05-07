package com.computadores_upb.modelo.repositorios;

import com.computadores_upb.modelo.entidades.Computador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComputadorRepositorio extends Repository<Computador, Long> {

    List<Computador> findAll();

    @Query(value = "select * from computador where marca = 'HP'",nativeQuery = true)
    List<Computador> traerTodo();

}
