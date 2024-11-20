package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Factura;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IFacturaRepository;
import com.corhuila.veterinaria.IService.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaService extends BaseService<Factura> implements IFacturaService {
    @Autowired
    private IFacturaRepository repository;
    @Override
    protected IBaseRepository<Factura, Long> getRepository() {
        return repository;
    }
}
