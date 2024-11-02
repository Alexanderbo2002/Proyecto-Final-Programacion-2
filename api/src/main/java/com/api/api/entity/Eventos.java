package com.api.api.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventos")
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long idEvento;

    @Column(name = "nombre_evento")
    private String nombreEvento;

    private LocalDate fecha;

    private String hora;

    private String ubicacion;

    @Column(name = "nombre_organizador")
    private String nombreOrganizador;

    @Column(name = "apellido_organizador")
    private String apellidoOrganizador;

    private String correo;

    private String telefono;

    public Eventos() {
    }

    public Eventos(String nombreEvento, LocalDate fecha, String hora, String ubicacion,
            String nombreOrganizador, String apellidoOrganizador, String correo, String telefono) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.nombreOrganizador = nombreOrganizador;
        this.apellidoOrganizador = apellidoOrganizador;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Getters y Setters
    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreOrganizador() {
        return nombreOrganizador;
    }

    public void setNombreOrganizador(String nombreOrganizador) {
        this.nombreOrganizador = nombreOrganizador;
    }

    public String getApellidoOrganizador() {
        return apellidoOrganizador;
    }

    public void setApellidoOrganizador(String apellidoOrganizador) {
        this.apellidoOrganizador = apellidoOrganizador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
