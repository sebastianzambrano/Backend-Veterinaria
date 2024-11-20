package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.DTO.ApiResponseDto;
import com.corhuila.veterinaria.DTO.IHistoriaClinicaDto;
import com.corhuila.veterinaria.Entity.HistoriaClinica;
import com.corhuila.veterinaria.IService.IHistoriaClinicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/historia-clinica")
public class HistoriaClinicaController extends BaseController<HistoriaClinica, IHistoriaClinicaService>{
    protected HistoriaClinicaController(IHistoriaClinicaService service) {
        super(service, "HistoriaClinica");
    }


    @GetMapping("/get-historia-clinica-mascota/{mascota_id}")
    public ResponseEntity<ApiResponseDto<List<IHistoriaClinicaDto>>> findHistoriaClinicaByMascota(@PathVariable Long mascota_id) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IHistoriaClinicaDto>>("Datos obtenidos", service.findHistoriaClinicaByMascota(mascota_id), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IHistoriaClinicaDto>>(e.getMessage(), null, false));
        }
    }
}
