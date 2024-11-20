package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.SesionAcceso;
import com.corhuila.veterinaria.IService.ISesionAccesoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/sesion-acceso")
public class SesionAccesoController extends BaseController<SesionAcceso, ISesionAccesoService> {
    protected SesionAccesoController(ISesionAccesoService service) {
        super(service, "SesionAcceso");
    }
}
