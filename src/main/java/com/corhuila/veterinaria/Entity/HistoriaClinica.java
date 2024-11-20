package com.corhuila.veterinaria.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HistoriaClinica extends Auditoria{
    @Column(nullable = false)
    @NotBlank(message = "El motivo consulta no puede estar vacío.")
    private String motivoConsulta;
    @Column(nullable = false)
    @NotBlank(message = "El diagnostico no puede estar vacío.")
    private String diagnostico;
    @Column(nullable = false)
    @NotBlank(message = "El procedimiento no puede estar vacío.")
    private String procedimiento;
    @Column(nullable = false)
    @NotBlank(message = "El tratamiento no puede estar vacío.")
    private String tratamiento;
    @Column(nullable = false)
    @NotBlank(message = "La observacion no puede estar vacío.")
    private String observacion;
    @Column(nullable = false)
    @NotBlank(message = "la formula no puede estar vacío.")
    private String formula;
    @ManyToOne(targetEntity = Trabajador.class)
    private Trabajador trabajador;

    @OneToOne(targetEntity = Mascota.class,  cascade = CascadeType.REFRESH)
    @JsonBackReference
    private Mascota mascota;
}
