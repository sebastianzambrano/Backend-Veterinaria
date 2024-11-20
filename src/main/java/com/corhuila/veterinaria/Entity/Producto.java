package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class Producto extends Auditoria{

    @Column(nullable = false)
    @NotBlank(message = "El fabricante no puede estar vacío.")
    private String fabricante;
    @Column(nullable = false)
    @NotBlank(message = "El nombre comercial no puede estar vacío.")
    private String nombreComercial;
    @Column(nullable = false)
    @NotBlank(message = "El nombre generico no puede estar vacío.")
    private String nombreGenerico;
    @Column(nullable = false)
    @NotBlank(message = "La presentación no puede estar vacío.")
    private String presentacion;
    @Column(nullable = false)
    @NotBlank(message = "El precio de venta no puede estar vacío.")
    private Float precioVenta;
    @Column(nullable = false)
    @NotBlank(message = "El costo unitario no puede estar vacío.")
    private Float costoUnitario;
    @Column(nullable = false)
    @NotBlank(message = "La descripción no puede estar vacío.")
    private String descripcion;
    @Column(nullable = false)
    @NotBlank(message = "El stock no puede estar vacío.")
    private Integer stock;
    @NotBlank(message = "La fecha de vencimiento no puede estar vacío.")
    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate fechaVencimiento;
    @OneToMany(targetEntity = ProductoProveedor.class, fetch = FetchType.LAZY, mappedBy = "producto")
    private List<ProductoProveedor>productoProveedors;

}
