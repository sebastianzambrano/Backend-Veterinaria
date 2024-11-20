package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.DTO.IMascotaDto;
import com.corhuila.veterinaria.Entity.Mascota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMascotaRepository extends IBaseRepository<Mascota, Long>{
    @Query("SELECT p FROM Mascota p WHERE p.cliente.id = :cliente_id AND p.deletedAt IS NULL")
    List<IMascotaDto> findMascotaByCliente(Long cliente_id);
}
