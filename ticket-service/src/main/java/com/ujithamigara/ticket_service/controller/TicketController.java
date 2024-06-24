package com.ujithamigara.ticket_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    @GetMapping("/checkTicket")
    public String userCheck(){
        return "Ticket Check ! ";
    }
}
