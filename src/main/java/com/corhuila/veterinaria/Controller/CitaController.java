package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Cita;
import com.corhuila.veterinaria.IService.ICitaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/cita")
public class CitaController extends BaseController<Cita, ICitaService>{
    protected CitaController(ICitaService service) {
        super(service, "Cita");
    }
}
