package com.corhuila.veterinaria.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SesionAcceso extends Auditoria{
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id") // Columna que será la clave foránea
    private User user;
}
