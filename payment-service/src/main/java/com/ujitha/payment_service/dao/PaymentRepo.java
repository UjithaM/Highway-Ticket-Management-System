package com.ujitha.payment_service.dao;

import com.ujitha.payment_service.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepo extends JpaRepository<PaymentEntity, String> {
    List<PaymentEntity> findByTicketId(String ticketId);
}
