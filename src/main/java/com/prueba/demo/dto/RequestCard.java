package com.prueba.demo.dto;

public class RequestCard {

    public Long pan;
    public String nombre;
    public String apellido;
    public Long cedula;
    public int tipoTarjeta;
    public Long telefono;
    public int estadoTarjeta;


    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public int getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(int tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public int getEstadoTarjeta() {
        return estadoTarjeta;
    }

    public void setEstadoTarjeta(int estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }
}
