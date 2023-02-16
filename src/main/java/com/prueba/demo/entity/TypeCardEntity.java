package com.prueba.demo.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "TypeTarjeta")
public class TypeCardEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id;

    @Column(name = "typeTarjeta")
    private String typeTarjeta;


    @ManyToOne
    @JoinColumn (name = "card_entity_id")
    private CardEntity cardEntity;

    public CardEntity getCardEntity() {
        return cardEntity;
    }

    public void setCardEntity(CardEntity cardEntity) {
        this.cardEntity = cardEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeTarjeta() {
        return typeTarjeta;
    }

    public void setTypeTarjeta(String typeTarjeta) {
        this.typeTarjeta = typeTarjeta;
    }
}
