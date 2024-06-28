package com.ujitha.payment_service.service;

import com.ujitha.payment_service.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO savePayment(PaymentDTO paymentDTO);

    void deletePayment(String paymentId);

    PaymentDTO getSelectedPayment(String paymentId);

    List<PaymentDTO> getAllPayment();

    void updatePayment(String paymentId, PaymentDTO paymentDTO);

    List<PaymentDTO> getPaymentTicketId(String ticketId);
}