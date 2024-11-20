package com.corhuila.veterinaria.DTO;

import java.time.LocalDateTime;

public interface IClienteDto {
    Long getId();

    String getTypeDocument();
    Long getNumberDocument();
    String getFirstName();
    String getSecondName();
    String getFirstLastName();
    String getSecondLastName();
    String getAddressResidence();
    String getPhoneMovil();
}
