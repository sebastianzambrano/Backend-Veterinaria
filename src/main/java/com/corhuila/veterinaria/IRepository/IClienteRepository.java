package com.corhuila.veterinaria.IRepository;

import com.corhuila.veterinaria.DTO.IClienteDto;
import com.corhuila.veterinaria.Entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IClienteRepository extends IBaseRepository<Cliente,Long>{
    @Query("SELECT p FROM Cliente p WHERE p.numberDocument = :numberDocument")
    Optional<IClienteDto> findEmployeeByCliente(Long numberDocument);
}
