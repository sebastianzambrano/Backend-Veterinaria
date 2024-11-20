package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Factura;
import com.corhuila.veterinaria.IService.IFacturaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/factura")
public class FacturaController extends BaseController<Factura, IFacturaService> {
    protected FacturaController(IFacturaService service) {
        super(service, "Factura");
    }
}
