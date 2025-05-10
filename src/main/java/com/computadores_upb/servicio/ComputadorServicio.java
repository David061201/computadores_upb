package com.computadores_upb.servicio;

import com.computadores_upb.modelo.entidades.Computador;

import java.util.List;

public interface ComputadorServicio {

    List<Computador> traerTodosComputador();

    Computador traerUnComputadorporId(Long id);

}
