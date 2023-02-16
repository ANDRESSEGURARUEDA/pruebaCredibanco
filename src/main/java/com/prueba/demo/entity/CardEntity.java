package com.prueba.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "Card")
public class CardEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id;

    @Column (name = "validationNumber")
    private Long validationNumber;

    @Column (name = "hash")
    private Long hash;
    @Column (name = "pan")
    private Long pan;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;

    @Column (name = "cedula")
    private Long cedula;

    @ManyToOne
    @JoinColumn (name = "type_card_entity_id")
    private TypeCardEntity typeCardEntity;

    @Column (name = "celular")
    private Long celular;


    @Column (name = "estadoTarjeta")
    private StatusCard estadoTarjeta;

    @Column (name = "tarjetaCreada")
    private LocalDateTime tarjetaCreada;

    @Column (name = "ultimaModificacion")
    private LocalDateTime ultimaModificacion;

    public Long getHash() {
        return hash;
    }

    public void setHash(Long hash) {
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValidationNumber() {
        return validationNumber;
    }

    public void setValidationNumber(Long validationNumber) {
        this.validationNumber = validationNumber;
    }

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

    public TypeCardEntity getTypeCardEntity() {
        return typeCardEntity;
    }

    public void setTypeCardEntity(TypeCardEntity typeCardEntity) {
        this.typeCardEntity = typeCardEntity;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public StatusCard getEstadoTarjeta() {
        return estadoTarjeta;
    }

    public void setEstadoTarjeta(StatusCard estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }

    public LocalDateTime getTarjetaCreada() {
        return tarjetaCreada;
    }

    public void setTarjetaCreada(LocalDateTime tarjetaCreada) {
        this.tarjetaCreada = tarjetaCreada;
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
}
