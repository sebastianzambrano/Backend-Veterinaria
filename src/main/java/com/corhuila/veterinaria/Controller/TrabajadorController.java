package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Trabajador;
import com.corhuila.veterinaria.IService.ITrabajdorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/trabajador")
public class TrabajadorController extends BaseController<Trabajador, ITrabajdorService> {
    protected TrabajadorController(ITrabajdorService service) {
        super(service, "Trabajador");
    }
}
