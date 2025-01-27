package com.callcenter.NoCountry.DTO;
import lombok.Data;

@Data
public class HistorialPagoDTO {
    private int idPago;
    private String fechaPago;
    private String fechaVencimiento;
    private double montoPagado;
}

