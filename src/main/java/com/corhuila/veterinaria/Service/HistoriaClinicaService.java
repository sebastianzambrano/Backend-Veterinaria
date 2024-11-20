package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.DTO.IHistoriaClinicaDto;
import com.corhuila.veterinaria.Entity.HistoriaClinica;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IHistoriaClinicaRepository;
import com.corhuila.veterinaria.IService.IHistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaService extends BaseService<HistoriaClinica> implements IHistoriaClinicaService {
    @Autowired
    private IHistoriaClinicaRepository repository;
    @Override
    protected IBaseRepository<HistoriaClinica, Long> getRepository() {
        return repository;
    }
    @Override
    public List<IHistoriaClinicaDto> findHistoriaClinicaByMascota (Long mascota_id){
        return  repository.findHistoriaClinicaByMascota(mascota_id);
    }
}
