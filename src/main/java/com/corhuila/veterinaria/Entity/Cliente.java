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
public class Cliente extends Persona{

    @OneToMany(targetEntity = Mascota.class, fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Mascota> Mascotas;

    @OneToMany(targetEntity = Factura.class, fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Factura> facturas;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User user;


}
