package com.corhuila.veterinaria.IService;

import com.corhuila.veterinaria.DTO.IHistoriaClinicaDto;
import com.corhuila.veterinaria.Entity.HistoriaClinica;

import java.util.List;

public interface IHistoriaClinicaService extends IBaseService<HistoriaClinica>{
    List<IHistoriaClinicaDto> findHistoriaClinicaByMascota (Long mascota_id);
}
