package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Permiso;
import com.corhuila.veterinaria.IService.IPermisoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/permiso")
public class PermisoController extends BaseController<Permiso, IPermisoService> {
    protected PermisoController(IPermisoService service) {
        super(service, "Permiso");
    }
}
