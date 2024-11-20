package com.corhuila.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserRol extends Auditoria{
    @ManyToOne(targetEntity = Rol.class)
    private Rol rol;
    @ManyToOne(targetEntity = User.class)
    private User user;
}
