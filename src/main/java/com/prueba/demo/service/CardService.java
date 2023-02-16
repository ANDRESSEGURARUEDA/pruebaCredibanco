package com.prueba.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.demo.dto.RequestCard;
import com.prueba.demo.dto.ResponseCard;
import com.prueba.demo.entity.CardEntity;
import com.prueba.demo.repository.ICardRepository;
import com.prueba.demo.repository.ICardTypeEntity;
import com.prueba.demo.repository.IStatusCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class CardService {

    @Autowired
    ICardRepository cardRepository;

    @Autowired
    ICardTypeEntity cardTypeEntity;

    @Autowired
    IStatusCard statusCard;

    CardEntity cardEntity = new CardEntity();

    ObjectMapper objectMapper = new ObjectMapper();

    public ResponseCard createCard(RequestCard requestCard) {
        ResponseCard responseCard = new ResponseCard();

        try {
            cardEntity.setValidationNumber((long) new Random().nextInt(100));
            cardEntity.setHash(Long.valueOf(String.valueOf(MessageDigest.getInstance("MD5").digest(String.valueOf(requestCard.getPan()).getBytes()))));
            cardEntity.setPan(requestCard.getPan());
            cardEntity.setNombre(requestCard.getNombre());
            cardEntity.setApellido(requestCard.getApellido());
            cardEntity.setCedula(requestCard.getCedula());
            cardEntity.setTypeCardEntity(cardTypeEntity.findByTypeTarjeta(requestCard.getTipoTarjeta()));
            cardEntity.setCelular(requestCard.getTelefono());
            cardEntity.setEstadoTarjeta(statusCard.findByStatus(requestCard.getEstadoTarjeta()));
            cardEntity.setTarjetaCreada(LocalDateTime.now());
            cardEntity.setUltimaModificacion(LocalDateTime.now());
            cardRepository.save(cardEntity);

            if (cardEntity.getId() != null){
                responseCard.setStatus();
            }



        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
