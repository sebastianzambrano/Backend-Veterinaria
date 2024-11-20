package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Proveedor extends Persona{
    @Column(nullable = false)
    @NotBlank(message = "El metodo de pago no puede estar vacío.")
    private String metodoPago;
    private String paginaWeb;
    @Column(nullable = false)
    @NotBlank(message = "La condicion de pago no puede estar vacío.")
    private String condicionPago;
    @Column(nullable = false)
    @NotBlank(message = "La cuenta bancaria no puede estar vacío.")
    private String cuentaBancaria;
    private Integer Descuento;

    @OneToMany(targetEntity = ProductoProveedor.class, fetch = FetchType.LAZY, mappedBy = "proveedor")
    private List<ProductoProveedor> productoProveedors;
}
