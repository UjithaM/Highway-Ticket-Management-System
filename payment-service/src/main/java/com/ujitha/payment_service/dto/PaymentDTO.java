package com.ujitha.payment_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private String paymentId;
    @NotNull(message = "Amount is mandatory")
    private double amount;
    @NotNull(message = "Payment Date is mandatory")
    private String paymentDate;
    @NotNull(message = "Payment Status is mandatory")
    private String paymentStatus;
    @NotNull(message = "Ticket ID is mandatory")
    private String ticketId;
}
