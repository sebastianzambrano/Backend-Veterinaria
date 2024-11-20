package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Permiso;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IPermisoRepository;
import com.corhuila.veterinaria.IService.IPermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermisoService extends BaseService<Permiso> implements IPermisoService {
    @Autowired
    private IPermisoRepository repository;
    @Override
    protected IBaseRepository<Permiso, Long> getRepository() {
        return repository;
    }
}
