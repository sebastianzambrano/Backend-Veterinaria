package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.Entity.Vacuna;
import com.corhuila.veterinaria.IService.IVacunaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/vacuna")
public class VacunaController extends BaseController<Vacuna, IVacunaService> {
    protected VacunaController(IVacunaService service) {
        super(service, "Vacuna");
    }
}
