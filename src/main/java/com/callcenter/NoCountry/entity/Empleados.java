package com.callcenter.NoCountry.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "empleados")
@Data
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "rol", nullable = false)
    private String rol;

    @Column(name = "correoPersonal", nullable = false, unique = true)
    private String correoPersonal;

    @Column(name = "correoEmpresarial", nullable = false, unique = true)
    private String correoEmpresarial;

    @Column(name = "clave", nullable = false)
    private String clave;

    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;

    @Column(name = "fechaIngreso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Column(name = "activo", nullable = false)
    private boolean activo;

}