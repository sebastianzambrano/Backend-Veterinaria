package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Proveedor;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IProveedorRepository;
import com.corhuila.veterinaria.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService extends BaseService<Proveedor> implements IProveedorService {
    @Autowired
    private IProveedorRepository repository;
    @Override
    protected IBaseRepository<Proveedor, Long> getRepository() {
        return repository;
    }
}
