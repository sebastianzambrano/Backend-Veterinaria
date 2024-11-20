package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.ProductoProveedor;
import com.corhuila.veterinaria.IService.IProductoProveedorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/producto-proveedor")
public class ProductoProveedorController extends BaseController<ProductoProveedor, IProductoProveedorService> {
    protected ProductoProveedorController(IProductoProveedorService service) {
        super(service, "ProductoProveedor");
    }
}
