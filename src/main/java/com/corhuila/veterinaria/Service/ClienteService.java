package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.DTO.IClienteDto;
import com.corhuila.veterinaria.Entity.Cliente;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IClienteRepository;
import com.corhuila.veterinaria.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService extends BaseService<Cliente> implements IClienteService {
    @Autowired
    private IClienteRepository repository;
    @Override
    protected IBaseRepository<Cliente, Long> getRepository() {
        return repository;
    }

    @Override
    public Optional<IClienteDto> findEmployeeByCliente(Long numberDocument) {
        return repository.findEmployeeByCliente(numberDocument);
    }
}
