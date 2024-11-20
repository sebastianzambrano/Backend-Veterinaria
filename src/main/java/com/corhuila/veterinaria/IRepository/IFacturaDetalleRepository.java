package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.Entity.FacturaDetalle;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDetalleRepository extends IBaseRepository<FacturaDetalle, Long> {
}
