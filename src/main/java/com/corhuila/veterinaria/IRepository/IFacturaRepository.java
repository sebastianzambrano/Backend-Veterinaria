package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.Entity.Factura;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends IBaseRepository<Factura,Long>{
}
