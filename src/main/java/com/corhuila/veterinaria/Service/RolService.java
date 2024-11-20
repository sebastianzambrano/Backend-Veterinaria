package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Rol;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IRolRepository;
import com.corhuila.veterinaria.IService.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService extends BaseService<Rol> implements IRolService {
    @Autowired
    private IRolRepository repository;
    @Override
    protected IBaseRepository<Rol, Long> getRepository() {
        return repository;
    }
}
