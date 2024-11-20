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
public class RolPermiso extends Auditoria{
    @ManyToOne(targetEntity = Rol.class)
    private Rol rol;
    @ManyToOne(targetEntity = Permiso.class)
    private Permiso permiso;
}
