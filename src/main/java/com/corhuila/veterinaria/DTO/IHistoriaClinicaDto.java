package com.corhuila.veterinaria.DTO;

import java.time.LocalDateTime;

public interface IHistoriaClinicaDto {
    Long getId();
    LocalDateTime getCreatedAt();
    String getMotivoConsulta();
    String getDiagnostico();
    String getProcedimiento();
    String getTratamiento();
    String getObservacion();
    String getFormula();
    String getTrabajador();

}
