package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.FacturaDetalle;
import com.corhuila.veterinaria.IService.IFacturaDetalleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/factura-detalle")
public class FacturaDetalleController extends BaseController<FacturaDetalle, IFacturaDetalleService> {
    protected FacturaDetalleController(IFacturaDetalleService service) {
        super(service, "FacturaDetalle");
    }
}
