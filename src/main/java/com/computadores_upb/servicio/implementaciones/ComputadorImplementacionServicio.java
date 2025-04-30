package com.computadores_upb.servicio.implementaciones;

import com.computadores_upb.modelo.entidades.Computador;
import com.computadores_upb.modelo.repositorios.ComputadorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadorImplementacionServicio implements ComputadorServiciol {

    private final ComputadorRepositorio computadorRepositorio;

    public ComputadorImplementacionServicio(ComputadorRepositorio computadorRepositorio) {
        this.computadorRepositorio = computadorRepositorio;
    }

    @Override
    public List<Computador> getTodasComputador(){

        return computadorRepositorio.findAll();
    }
}
