package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Proveedor;
import com.corhuila.veterinaria.IService.IProveedorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/proveedor")
public class ProveedorController extends BaseController<Proveedor, IProveedorService> {
    protected ProveedorController(IProveedorService service) {
        super(service, "Proveedor");
    }
}
