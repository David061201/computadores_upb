package com.computadores_upb.servicio;

import com.computadores_upb.modelo.entidades.Proveedor;

import java.util.List;

public interface ProveedorServicio {
    List<Proveedor> getTodasProveedor();

    List<Proveedor> getTodasProveedorManual();

}
