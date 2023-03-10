package com.prueba.demo.repository;

import com.prueba.demo.entity.TypeCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICardTypeEntity extends JpaRepository<TypeCardEntity, Long> {

        TypeCardEntity findByTypeTarjeta(int type);
}
