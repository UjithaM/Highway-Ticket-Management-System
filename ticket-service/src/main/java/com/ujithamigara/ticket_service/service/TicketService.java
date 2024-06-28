package com.ujithamigara.ticket_service.service;

import com.ujithamigara.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {
    TicketDTO saveTicket(TicketDTO ticketDTO);
    void deleteTicket(String ticketId);
    TicketDTO getSelectedTicket(String ticketId);
    List<TicketDTO> getAllTicket();
    void updateTicket(String ticketId,TicketDTO ticketDTO);
    List<TicketDTO> getTicketByUserId(String userId);
}
