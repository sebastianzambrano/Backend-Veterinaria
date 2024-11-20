package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Trabajador;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.ITrabajadorRepository;
import com.corhuila.veterinaria.IService.ITrabajdorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajadorService extends BaseService<Trabajador> implements ITrabajdorService {
    @Autowired
    private ITrabajadorRepository repository;
    @Override
    protected IBaseRepository<Trabajador, Long> getRepository() {
        return repository;
    }
}
