package com.corhuila.veterinaria.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"correoElectronico"})})
@Entity
public class User extends Auditoria{
    @Email(message = "Correo debe ser valido y contar con su respectivo formato")
    @NotBlank(message = "El correo electronico es obligatorio")
    private String correoElectronico;
    @Size(min = 8, max = 20, message = "La contraseña debe tener entre 8 y 20 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "La contraseña debe contener al menos una letra mayúscula, una letra minúscula, un número y un carácter especial")
    @NotBlank(message = "La contraseña no puede estar en blanco")
    @Column(name = "password", nullable = false)
    @JsonIgnore
    private String password;

    @OneToMany(targetEntity = UserRol.class, fetch = FetchType.LAZY, mappedBy = "user")
    private List<UserRol> userRols;
    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Trabajador trabajador;
    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Cliente cliente;
}
