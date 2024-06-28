package com.ujitha.payment_service.service.impl;

import com.ujitha.payment_service.dto.PaymentDTO;
import com.ujitha.payment_service.service.PaymentService;

import java.util.List;

public class PaymentServiceIMPL implements PaymentService {



    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public void deletePayment(String paymentId) {

    }

    @Override
    public PaymentDTO getSelectedPayment(String paymentId) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return List.of();
    }

    @Override
    public void updatePayment(String paymentId, PaymentDTO paymentDTO) {

    }

    @Override
    public List<PaymentDTO> getPaymentTicketId(String ticketId) {
        return List.of();
    }
}
