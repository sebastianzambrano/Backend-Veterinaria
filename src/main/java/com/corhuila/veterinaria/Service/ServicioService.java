package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Servicio;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IServicioRepository;
import com.corhuila.veterinaria.IService.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioService extends  BaseService<Servicio> implements IServicioService {
    @Autowired
    private IServicioRepository repository;
    @Override
    protected IBaseRepository<Servicio, Long> getRepository() {
        return repository;
    }
}
