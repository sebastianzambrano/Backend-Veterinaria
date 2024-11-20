package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import javax.validation.constraints.Future;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cita extends Auditoria{
    @Column(columnDefinition = "DATE", nullable = false)
    @Future(message = "La fecha de la cita debe ser en el futuro.")
    @NotNull(message = "La fecha de cita no puede estar vacío.")
    private LocalDate fechaCita;
    @Column(columnDefinition = "TIME", nullable = false)
    @NotNull(message = "La hora de cita no puede estar vacío.")
    private LocalTime horaCita;
    @Column(nullable = false)
    @NotBlank(message = "El motivo no puede estar vacío.")
    private String motivo;
    @Column(nullable = false)
    @NotBlank(message = "El trabajador no puede estar vacío.")
    private String trabajador;
    @ManyToOne(targetEntity = Mascota.class)
    private Mascota mascota;

}
