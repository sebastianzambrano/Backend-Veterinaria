package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.DTO.IHistoriaClinicaDto;
import com.corhuila.veterinaria.Entity.HistoriaClinica;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHistoriaClinicaRepository extends IBaseRepository<HistoriaClinica, Long>{
    @Query("SELECT p FROM HistoriaClinica p WHERE p.mascota.id = :mascota_id AND p.deletedAt IS NULL")
    List<IHistoriaClinicaDto> findHistoriaClinicaByMascota(Long mascota_id);
}
