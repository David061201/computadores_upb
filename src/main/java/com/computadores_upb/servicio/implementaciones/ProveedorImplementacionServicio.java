package com.computadores_upb.servicio.implementaciones;


import com.computadores_upb.modelo.entidades.Proveedor;
import com.computadores_upb.modelo.repositorios.ProveedorRepositorio;
import com.computadores_upb.servicio.ProveedorServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProveedorImplementacionServicio implements ProveedorServicio {

    private final ProveedorRepositorio proveedorRepositorio;

    public ProveedorImplementacionServicio(ProveedorRepositorio proveedorRepositorio) {
        this.proveedorRepositorio = proveedorRepositorio;
    }

    @Override
    public List<Proveedor> getTodasProveedor(){

        return proveedorRepositorio.getTodasProveedor();
    }

    @Override
    public Proveedor traerUnProveedorporId(Long id){

        return proveedorRepositorio.traerUnProveedorporId(id);
    }
}
