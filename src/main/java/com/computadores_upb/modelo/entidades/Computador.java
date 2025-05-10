package com.computadores_upb.modelo.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "computador")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Computador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String procesador;
    private String ram_gb;
    private String almacenamiento_gb;
    private Integer precio;
    private Long fk_id_proveedores;

}
