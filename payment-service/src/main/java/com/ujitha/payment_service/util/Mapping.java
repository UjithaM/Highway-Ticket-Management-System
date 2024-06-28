package com.ujitha.payment_service.util;



import com.ujitha.payment_service.dto.PaymentDTO;
import com.ujitha.payment_service.entity.PaymentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapping {
    private final ModelMapper mapper;
    Mapping(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public PaymentDTO toPaymentDTO (PaymentEntity paymentEntity) {
        return mapper.map(paymentEntity, PaymentDTO.class);
    }

    public PaymentEntity toPaymentEntity (PaymentDTO paymentDTO) {
        return mapper.map(paymentDTO, PaymentEntity.class);
    }

    public List<PaymentDTO> toPaymentDTOList(List<PaymentEntity> paymentEntities) {
        return paymentEntities.stream()
                .map(paymentEntity -> mapper.map(paymentEntity, PaymentDTO.class))
                .collect(Collectors.toList());
    }
}
