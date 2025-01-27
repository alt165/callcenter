package com.callcenter.NoCountry.entity;

import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_de_pagos")
@Data
public class HistorialPagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pago")
    private int id;

//    @ManyToOne
//    @JoinColumn(name = "id_ClienteServicio", referencedColumnName = "id_ClienteServicio")
//    private ClienteServicio clienteServicio;

    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "fechaVencimiento", nullable = false)
    private LocalDateTime fechaVencimiento;

    @Column(name = "montoPagado", nullable = false)
    private double montoPagado;

//    @ManyToOne
//    @JoinColumn(name = "id_Cliente", referencedColumnName = "id_Cliente")
//    private Clientes cliente;


}

