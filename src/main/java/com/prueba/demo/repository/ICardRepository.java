package com.prueba.demo.repository;

import com.prueba.demo.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends JpaRepository<CardEntity, Long> {
}
