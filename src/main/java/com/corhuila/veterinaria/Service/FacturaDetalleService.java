package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.FacturaDetalle;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IFacturaDetalleRepository;
import com.corhuila.veterinaria.IService.IFacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaDetalleService extends BaseService<FacturaDetalle> implements IFacturaDetalleService {
    @Autowired
    private IFacturaDetalleRepository repository;
    @Override
    protected IBaseRepository<FacturaDetalle, Long> getRepository() {
        return repository;
    }
}
