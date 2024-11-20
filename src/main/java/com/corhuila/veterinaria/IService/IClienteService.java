package com.corhuila.veterinaria.IService;

import com.corhuila.veterinaria.DTO.IClienteDto;
import com.corhuila.veterinaria.Entity.Cliente;

import java.util.Optional;

public interface IClienteService extends IBaseService<Cliente>{
    Optional<IClienteDto> findEmployeeByCliente(Long numberDocument);
}
