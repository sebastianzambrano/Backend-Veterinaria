package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FacturaDetalle extends Auditoria{
    @ManyToOne(targetEntity = Factura.class)
    private Factura factura;

    @ManyToOne(targetEntity = Producto.class)
    private Producto producto;

    @ManyToOne(targetEntity = Servicio.class)
    private Servicio servicio;
}
