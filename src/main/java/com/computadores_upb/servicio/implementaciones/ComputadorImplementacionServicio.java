package com.computadores_upb.servicio.implementaciones;

import com.computadores_upb.modelo.entidades.Computador;
import com.computadores_upb.modelo.repositorios.ComputadorRepositorio;
import com.computadores_upb.servicio.ComputadorServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComputadorImplementacionServicio implements ComputadorServicio {

    private final ComputadorRepositorio computadorRepositorio;

    public ComputadorImplementacionServicio(ComputadorRepositorio computadorRepositorio) {
        this.computadorRepositorio = computadorRepositorio;
    }

    @Override
    public List<Computador> traerTodosComputador(){

        return computadorRepositorio.traerTodosComputador();
    }

    @Override
    public Computador traerUnComputadorporId(Long id) {

        return computadorRepositorio.traerUnComputadorporId(id);
    }
}
