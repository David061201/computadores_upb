package com.computadores_upb.controlador;


import com.computadores_upb.modelo.entidades.Computador;
import com.computadores_upb.servicio.ComputadorServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputadorControlador {

    private final ComputadorServicio computadorServicio;

    public ComputadorControlador(ComputadorServicio computadorServicio) {
        this.computadorServicio = computadorServicio;
    }

    @GetMapping("/computador")
    public ResponseEntity<List<Computador>> getComputador(){
        List<Computador> listacomputador = computadorServicio.traerTodosComputador();
        return ResponseEntity.ok(listacomputador);
    }

    @GetMapping("/computadorManual/{id}")
    public ResponseEntity<Computador> getComputadorManual(@PathVariable("id")Long id){
        Computador computador = computadorServicio.traerUnComputadorporId(id);
        return ResponseEntity.ok(computador);

    }

}
