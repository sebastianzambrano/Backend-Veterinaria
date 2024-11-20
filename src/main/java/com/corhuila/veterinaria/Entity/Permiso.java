package com.corhuila.veterinaria.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
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
public class Permiso extends Auditoria{
    @Column(name = "nombre permiso")
    @NotBlank(message = "El nombre del permiso debe ser obligatorio")
    @Schema(description = "nombre permiso", example = "")
    private String nombre;
    @Column(name = "descripcion permiso")
    @NotBlank(message = "La descripcion del permiso debe ser obligatorio")
    @Schema(description = "descripcion permiso", example = "")
    private String descripcion;

    @OneToMany(targetEntity = RolPermiso.class, fetch = FetchType.LAZY, mappedBy = "permiso")
    private List<RolPermiso> rolPermisos;
}
