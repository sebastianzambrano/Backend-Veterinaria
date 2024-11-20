package com.corhuila.veterinaria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Factura extends Auditoria{
    @Column(name = "fecha_factura", columnDefinition = "DATE")
    @NotBlank(message = "La fecha de factura no puede estar vacío.")
    private LocalDate fechaFactura;
    @Column(name = "cantidad", nullable = false)
    @NotBlank(message = "La cantidad no puede estar vacío.")
    private Float cantidad;
    @Column(name = "medio_pago", nullable = false)
    @NotBlank(message = "El medio de pago no puede estar vacío.")
    private String medioPago;
    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;
    @OneToMany(targetEntity = FacturaDetalle.class,mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FacturaDetalle> facturaDetalles;
}
