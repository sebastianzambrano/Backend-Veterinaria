package com.corhuila.veterinaria.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@MappedSuperclass
public abstract class Persona extends Auditoria{
    @Column(name = "tipo_documento")
    @NotBlank(message = "El tipo de identificacion debe ser obligatorio")
    @Schema(description = "tipo de documento", example = "")
    private String typeDocument;
    @Column (name = "numero_documento")
    @NotBlank(message = "El numerp de identificacion debe ser obligatorio")
    @Schema(description = "numero de documento", example = "")
    private Long numberDocument;
    @Column (name = "fecha_nacimiento", columnDefinition = "DATE")
    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Past(message = "La fecha de nacimiento debe de contar con fecha del pasado no con fechas futuras")
    @Schema(description = "Fecha nacimiento", example = "1990-05-20")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateBirth;
    @Column (name = "primer_nombre")
    @Size(min = 2, message = "El primer nombre debe tener al menos 2 caracteres")
    @NotBlank(message = "el primer nombre debe ser obligatorio")
    @Schema(description = "primer nombre", example = "")
    private String firstName;
    @Column (name = "segundo_nombre")
    @Size(min = 2, message = "El segundo nombre debe tener al menos 2 caracteres")
    @Schema(description = "segundo nombre", example = "")
    private String secondName;
    @Column (name = "primer_apellido")
    @Size(min = 2, message = "El apellido debe tener al menos 2 caracteres")
    @NotBlank(message = "El primer apellido debe ser obligatorio")
    @Schema(description = "primer apellido", example = "")
    private String firstLastName;
    @Column (name = "segundo_apellido")
    @Size(min = 2, message = "El apellido debe tener al menos 2 caracteres")
    @Schema(description = "segundo apellido", example = "")
    private String secondLastName;
    @Column (name = "ubicación_residencia")
    @NotBlank(message = "la ubicación de residencia debe ser obligatorio")
    @Schema(description = "ubicación de residencia", example = "")
    private String locationResidence;
    @Column (name = "direccion_residencia")
    @NotBlank(message = "la direccionn de residencia debe ser obligatorio")
    @Schema(description = "direccion de residencia", example = "")
    private String addressResidence;
    @Column (name = "telefono_movil")
    @Size(min = 10, max = 10, message = "El telefono movil debe tener 10 caracteres")
    @NotBlank(message = "telefono movil debe ser obligatorio")
    @Schema(description = "telefono movil", example = "")
    private String phoneMovil;
}
