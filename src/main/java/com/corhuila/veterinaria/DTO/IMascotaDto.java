package com.corhuila.veterinaria.DTO;

import java.time.LocalDate;

public interface IMascotaDto {
    Long getId();
    String getNombre();
    String getEspecie();
    String getSexo();
    LocalDate getFechaNacimiento();
    String getRaza();
    String getCodigoCollar();

}
