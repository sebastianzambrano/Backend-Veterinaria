package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Producto;
import com.corhuila.veterinaria.IService.IProductoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/producto")
public class ProductoController extends BaseController<Producto, IProductoService> {
    protected ProductoController(IProductoService service) {
        super(service, "Producto");
    }
}
