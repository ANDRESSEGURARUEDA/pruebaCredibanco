package com.prueba.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCard {

    @JsonProperty ("status")
    private String status;

    @JsonProperty ("message")
    private String message;
    public Long numeroValidacion;
    public Long pan;
    public Long identificadorDelSisitema;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getNumeroValidacion() {
        return numeroValidacion;
    }

    public void setNumeroValidacion(Long numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }

    public Long getIdentificadorDelSisitema() {
        return identificadorDelSisitema;
    }

    public void setIdentificadorDelSisitema(Long identificadorDelSisitema) {
        this.identificadorDelSisitema = identificadorDelSisitema;
    }
}
