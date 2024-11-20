package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.Entity.Vacuna;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IVacunaRepository;
import com.corhuila.veterinaria.IService.IVacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunaService extends BaseService<Vacuna> implements IVacunaService {
    @Autowired
    private IVacunaRepository repository;
    @Override
    protected IBaseRepository<Vacuna, Long> getRepository() {
        return repository;
    }
}
