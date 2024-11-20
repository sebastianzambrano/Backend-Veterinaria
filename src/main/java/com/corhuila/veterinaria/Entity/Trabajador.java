package com.corhuila.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trabajador extends Persona {

    @OneToMany(targetEntity = HistoriaClinica.class, fetch = FetchType.LAZY,mappedBy = "trabajador")
    private List<HistoriaClinica> historiaClinicas;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id") // Columna que será la clave foránea
    private User user;


}
