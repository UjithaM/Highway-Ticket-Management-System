package com.ujitha.payment_service.service.impl;

import com.ujitha.payment_service.dao.PaymentRepo;
import com.ujitha.payment_service.dto.PaymentDTO;
import com.ujitha.payment_service.entity.PaymentEntity;
import com.ujitha.payment_service.service.PaymentService;
import com.ujitha.payment_service.util.Mapping;
import com.ujitha.payment_service.util.exception.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class PaymentServiceIMPL implements PaymentService {

    private final PaymentRepo paymentRepo;

    private final Mapping mapping;

    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {
        long paymentCount = paymentRepo.count();
        String paymentId = String.format("P%04d", paymentCount + 1);
        paymentDTO.setPaymentId(paymentId);
        return mapping.toPaymentDTO(paymentRepo.save(mapping.toPaymentEntity(paymentDTO)));
    }

    @Override
    public void deletePayment(String paymentId) {
        if (paymentRepo.existsById(paymentId)){
            paymentRepo.deleteById(paymentId);
        } else throw new NotFoundException("Payment not found" + paymentId);
    }

    @Override
    public PaymentDTO getSelectedPayment(String paymentId) {
        PaymentEntity paymentEntity = paymentRepo.findById(paymentId)
                .orElseThrow(() -> new NotFoundException("Payment not found" + paymentId));
        return mapping.toPaymentDTO(paymentEntity);
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return mapping.toPaymentDTOList(paymentRepo.findAll());
    }

    @Override
    public void updatePayment(String paymentId, PaymentDTO paymentDTO) {
        PaymentEntity paymentEntity = paymentRepo.findById(paymentId)
                .orElseThrow(() -> new NotFoundException("Payment not found" + paymentId));
        if (paymentEntity != null) {
            paymentEntity.setAmount(paymentDTO.getAmount());
            paymentEntity.setPaymentDate(paymentDTO.getPaymentDate());
            paymentEntity.setPaymentStatus(paymentDTO.getPaymentStatus());
            paymentEntity.setTicketId(paymentDTO.getTicketId());
            paymentRepo.save(paymentEntity);
        }
    }

    @Override
    public List<PaymentDTO> getPaymentTicketId(String ticketId) {
        return mapping.toPaymentDTOList(paymentRepo.findByTicketId(ticketId));
    }
}
