package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vacuna extends Auditoria{
    @Column(nullable = false)
    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombre;
    @Column(columnDefinition = "TIME", nullable = false)
    @NotBlank(message = "La fecha de vacuna no puede estar vacío.")
    private LocalDate fechaAdministracion;
    @Column(columnDefinition = "TIME", nullable = false)
    @NotBlank(message = "La fecha de proxima vacuna no puede estar vacío.")
    private LocalDate proximaAdministracion;
    @Column(nullable = false)
    @NotBlank(message = "El tipo de vacuna no puede estar vacío.")
    private String tipoVacuna;
    @Column(nullable = false)
    @NotBlank(message = "La via de administración no puede estar vacío.")
    private String viaAdministracion;
    @Column(nullable = false)
    @NotBlank(message = "El dosis de administración no puede estar vacío.")
    private String dosisSuministrada;
    @ManyToOne(targetEntity = Mascota.class)
    private Mascota mascota;
}
