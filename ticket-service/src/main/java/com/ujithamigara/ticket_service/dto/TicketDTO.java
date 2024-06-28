package com.ujithamigara.ticket_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketDTO {
    private String ticketId;
    @NotBlank(message = "Ticket Issue Date is mandatory")
    private Date ticketIssueDate;
    @NotBlank(message = "Ticket Status is mandatory")
    private String ticketStatus;
    @NotBlank(message = "Vehicle Id is mandatory")
    private String vehicleId;
    @NotBlank(message = "User Id is mandatory")
    private String userId;
}
