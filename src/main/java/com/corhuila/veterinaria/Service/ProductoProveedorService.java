package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.ProductoProveedor;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IProductoProveedorRepository;
import com.corhuila.veterinaria.IService.IProductoProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoProveedorService extends BaseService<ProductoProveedor> implements IProductoProveedorService {
    @Autowired
    private IProductoProveedorRepository repository;
    @Override
    protected IBaseRepository<ProductoProveedor, Long> getRepository() {
        return repository;
    }
}
