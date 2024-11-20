package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Producto;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IProductoRepository;
import com.corhuila.veterinaria.IService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto> implements IProductoService {
    @Autowired
    private IProductoRepository repository;
    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return repository;
    }
}
