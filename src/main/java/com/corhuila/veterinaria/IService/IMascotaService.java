package com.corhuila.veterinaria.IService;

import com.corhuila.veterinaria.DTO.IMascotaDto;
import com.corhuila.veterinaria.Entity.Mascota;
import java.util.List;

public interface IMascotaService extends IBaseService<Mascota>{
    List<IMascotaDto> findMascotaByCliente(Long cliente_id);
}
