package com.prueba.demo.repository;

import com.prueba.demo.entity.StatusCard;
import com.prueba.demo.entity.TypeCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusCard extends JpaRepository<StatusCard, Long> {

    StatusCard findByStatus(int status);

}
