package com.computadores_upb.modelo.repositorios;

import com.computadores_upb.modelo.entidades.Proveedor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProveedorRepositorio extends Repository<Proveedor, Long> {

    List<Proveedor> findAll();

    @Query(value = "select * from proveedores where ciudad = 'Medellin'",nativeQuery = true)
    List<Proveedor> traerTodo();

}
