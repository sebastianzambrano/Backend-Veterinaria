package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Rol;
import com.corhuila.veterinaria.IService.IRolService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/rol")
public class RolController extends BaseController<Rol, IRolService> {
    protected RolController(IRolService service) {
        super(service, "Rol");
    }
}
