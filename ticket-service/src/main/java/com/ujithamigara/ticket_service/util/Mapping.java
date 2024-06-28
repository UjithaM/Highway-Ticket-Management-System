package com.ujithamigara.ticket_service.util;


import com.ujithamigara.ticket_service.dto.TicketDTO;
import com.ujithamigara.ticket_service.entity.TicketEntity;
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

    public TicketDTO toTicketDTO (TicketEntity ticketEntity) {
        return mapper.map(ticketEntity, TicketDTO.class);
    }

    public TicketEntity toTicketEntity (TicketDTO ticketDTO) {
        return mapper.map(ticketDTO, TicketEntity.class);
    }

    public List<TicketDTO> toTicketDTOList(List<TicketEntity> ticketEntities) {
        return ticketEntities.stream()
                .map(ticketEntity -> mapper.map(ticketEntity, TicketDTO.class))
                .collect(Collectors.toList());
    }
}
