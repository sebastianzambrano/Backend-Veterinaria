package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Cita;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.ICitaRepository;
import com.corhuila.veterinaria.IService.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaService extends BaseService<Cita> implements ICitaService {
    @Autowired
    private ICitaRepository repository;
    @Override
    protected IBaseRepository<Cita, Long> getRepository() {
        return repository;
    }
}
