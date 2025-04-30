package com.computadores_upb.controlador;


import com.computadores_upb.modelo.entidades.Proveedor;
import com.computadores_upb.servicio.ProveedorServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProveedorControlador {

    private final ProveedorServicio proveedorServicio;

    public ProveedorControlador(ProveedorServicio proveedorServicio) {
        this.proveedorServicio = proveedorServicio;
    }

    @GetMapping("/proveedores")
    public List<Proveedor> getProveedores(){
        return proveedorServicio.getTodasProveedor();
    }

    @GetMapping("/proveedoresManual")
    public List<Proveedor> getProveedoresManual(){
        return proveedorServicio.getTodasProveedorManual();
    }
}
