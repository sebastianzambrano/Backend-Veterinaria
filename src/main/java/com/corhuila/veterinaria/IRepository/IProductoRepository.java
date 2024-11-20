package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.Entity.Producto;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends IBaseRepository<Producto,Long>{
}
