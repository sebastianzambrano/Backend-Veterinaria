package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.Entity.Vacuna;
import org.springframework.stereotype.Repository;

@Repository
public interface IVacunaRepository extends IBaseRepository<Vacuna, Long>{
}
