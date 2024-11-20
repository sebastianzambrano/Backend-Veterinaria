package com.corhuila.veterinaria.Controller;

import com.corhuila.veterinaria.DTO.ApiResponseDto;
import com.corhuila.veterinaria.DTO.IClienteDto;
import com.corhuila.veterinaria.Entity.Cliente;
import com.corhuila.veterinaria.IService.IClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/veterinaria/cliente")
public class ClienteController extends BaseController<Cliente, IClienteService>{
    protected ClienteController(IClienteService service) {
        super(service, "Cliente");
    }

    @GetMapping("/get-cliente/{numberDocument}")
    public ResponseEntity<ApiResponseDto<Optional<IClienteDto>>> findEmployeeByUser(@PathVariable Long numberDocument) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<Optional<IClienteDto>>("Datos obtenidos", service.findEmployeeByCliente(numberDocument), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<Optional<IClienteDto>>(e.getMessage(), null, false));
        }
    }
}
