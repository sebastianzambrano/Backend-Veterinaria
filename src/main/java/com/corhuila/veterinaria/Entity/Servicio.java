package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Servicio extends Auditoria{
    @Column(nullable = false)
    @NotBlank(message = "La categoria no puede estar vacío.")
    private String categoria;
    @Column(nullable = false)
    @NotBlank(message = "El precio de venta no puede estar vacío.")
    private Float precioVenta;
    @Column(nullable = false)
    @NotBlank(message = "El costo unitario no puede estar vacío.")
    private Float costoUnitario;

    @Column(nullable = false)
    @NotBlank(message = "El descuento no puede estar vacío.")
    private String descuento;

    @Column(nullable = false)
    @NotBlank(message = "La descripciòn no puede estar vacío.")
    private String descripcion;

    @Column(nullable = false)
    @NotBlank(message = "El nombre del servicio no puede estar vacío.")
    private String nombreServicio;

}
