package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Servicio;
import com.corhuila.veterinaria.IService.IServicioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/servicio")
public class ServicioController extends BaseController<Servicio, IServicioService> {
    protected ServicioController(IServicioService service) {
        super(service, "Servicio");
    }
}
