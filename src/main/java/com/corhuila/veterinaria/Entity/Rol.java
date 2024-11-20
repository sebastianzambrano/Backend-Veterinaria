package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rol extends Auditoria{
    @Column(nullable = false, unique = true)
    private String name; // Ejemplo: "ROLE_ADMIN", "ROLE_USER"

    @OneToMany(targetEntity = RolPermiso.class, fetch = FetchType.LAZY, mappedBy = "rol")
    private List<RolPermiso> rolPermisos;

    @OneToMany(targetEntity = UserRol.class, fetch = FetchType.LAZY, mappedBy = "rol")
    private List<UserRol> userRols;
}
