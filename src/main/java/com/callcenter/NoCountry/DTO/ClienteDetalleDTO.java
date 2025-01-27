package com.callcenter.NoCountry.DTO;

import lombok.Data;
import java.util.List;

@Data
public class ClienteDetalleDTO {
    private Long idCliente;
    private Long dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String estado;
    private boolean activo;

    private List<ServicioDTO> servicios;
    private List<IncidenciaDTO> incidencias;
    private List<HistorialPagoDTO> historialPagos;

    @Data
    public static class ServicioDTO {
        private int idServicio;
        private String nombre;
        private String descripcion;
        private double precio;
    }

    @Data
    public static class IncidenciaDTO {
        private int idIncidencia;
        private String fechaDeAlta;
        private String descripcion;
        private List<DetalleIncidenciaDTO> detalles;

        @Data
        public static class DetalleIncidenciaDTO {
            private int idDetalle;
            private String fechaDeModificacion;
            private String descripcion;
            private String estado;
            private int prioridad;
        }
    }

    @Data
    public static class HistorialPagoDTO {
        private int idPago;
        private String fechaPago;
        private String fechaVencimiento;
        private double montoPagado;
    }
}
