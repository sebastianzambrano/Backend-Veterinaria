package com.corhuila.veterinaria.Service;

import com.corhuila.veterinaria.DTO.IMascotaDto;
import com.corhuila.veterinaria.Entity.Mascota;
import com.corhuila.veterinaria.IRepository.IBaseRepository;
import com.corhuila.veterinaria.IRepository.IMascotaRepository;
import com.corhuila.veterinaria.IService.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MascotaService extends BaseService<Mascota> implements IMascotaService {

    @Autowired
    private IMascotaRepository repository;
    @Override
    protected IBaseRepository<Mascota, Long> getRepository() {
        return repository;
    }
    @Override
    public List<IMascotaDto> findMascotaByCliente(Long cliente_id) {
        return repository.findMascotaByCliente(cliente_id);
    }

}
