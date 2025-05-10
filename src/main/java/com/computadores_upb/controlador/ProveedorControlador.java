package com.computadores_upb.controlador;


import com.computadores_upb.modelo.entidades.Proveedor;
import com.computadores_upb.servicio.ProveedorServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProveedorControlador {

    private final ProveedorServicio proveedorServicio;

    public ProveedorControlador(ProveedorServicio proveedorServicio) {
        this.proveedorServicio = proveedorServicio;
    }

    @GetMapping("/proveedores")
    public ResponseEntity<List<Proveedor>> getProveedores(){
        List<Proveedor> listaproveedor = proveedorServicio.getTodasProveedor();
        return ResponseEntity.ok(listaproveedor);
    }

    @GetMapping("/proveedoresManual/{id}")
    public ResponseEntity<Proveedor> getProveedoresManual(@PathVariable("id")Long id){
        Proveedor proveedor = proveedorServicio.traerUnProveedorporId(id);
        return ResponseEntity.ok(proveedor);
    }
}
