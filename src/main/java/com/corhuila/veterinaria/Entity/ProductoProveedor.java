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
public class ProductoProveedor extends Auditoria{
    @ManyToOne(targetEntity = Producto.class)
    private Producto producto;

    @ManyToOne(targetEntity = Proveedor.class)
    private Proveedor proveedor;

}
