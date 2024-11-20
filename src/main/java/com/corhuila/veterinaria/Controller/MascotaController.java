package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.DTO.ApiResponseDto;
import com.corhuila.veterinaria.DTO.IMascotaDto;
import com.corhuila.veterinaria.Entity.Mascota;
import com.corhuila.veterinaria.IService.IMascotaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/mascota")
public class MascotaController extends BaseController<Mascota, IMascotaService> {
    protected MascotaController(IMascotaService service) {
        super(service, "Mascota");
    }

    @GetMapping("/get-mascota-cliente/{cliente_id}")
    public ResponseEntity<ApiResponseDto<List<IMascotaDto>>> findMascotaByCliente(@PathVariable Long cliente_id) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IMascotaDto>>("Datos obtenidos", service.findMascotaByCliente(cliente_id), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IMascotaDto>>(e.getMessage(), null, false));
        }
    }
}
