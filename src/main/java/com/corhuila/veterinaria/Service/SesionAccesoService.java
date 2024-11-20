package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.SesionAcceso;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.ISesionAccesoRepository;
import com.corhuila.veterinaria.IService.ISesionAccesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionAccesoService extends BaseService<SesionAcceso> implements ISesionAccesoService {
    @Autowired
    private ISesionAccesoRepository repository;
    @Override
    protected IBaseRepository<SesionAcceso, Long> getRepository() {
        return repository;
    }
}
