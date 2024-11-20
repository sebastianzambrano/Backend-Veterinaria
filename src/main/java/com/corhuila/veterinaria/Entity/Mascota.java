package com.corhuila.veterinaria.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Mascota extends Auditoria{
    @Column(name = "nombre", length = 20)
    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombre;
    @Column(name = "especie", length = 20)
    @NotBlank(message = "La especie no puede estar vacío.")
    private String especie;
    @Column(name = "sexo", length = 20)
    @NotBlank(message = "El sexo no puede estar vacío.")
    private String sexo;
    @Column(name = "fecha_nacimineto", columnDefinition = "DATE")
    @NotBlank(message = "La fecha de nacimiento no puede estar vacío.")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaNacimiento;
    @Column(name = "raza", length = 20)
    private String raza;

    @Column(name = "codigo_collar", length = 20)
    private String codigoCollar;

    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;

    @OneToMany(targetEntity = Cita.class, fetch = FetchType.LAZY, mappedBy = "mascota")
    private List<Cita> citas;

    @OneToMany(targetEntity = Vacuna.class, fetch = FetchType.LAZY, mappedBy = "mascota")
    private List<Vacuna> vacunas;





}
