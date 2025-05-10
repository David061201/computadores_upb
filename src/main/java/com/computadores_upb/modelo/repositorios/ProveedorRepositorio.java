package com.computadores_upb.modelo.repositorios;

import com.computadores_upb.modelo.entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long> {

    @Query(value = "select * from proveedores",nativeQuery = true)
    List<Proveedor> getTodasProveedor();

    @Query(value = "select * from proveedores where id=:id",nativeQuery = true)
    Proveedor traerUnProveedorporId(@Param("id") Long id);

}
