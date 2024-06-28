package com.ujithamigara.ticket_service.dao;

import com.ujithamigara.ticket_service.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepo extends JpaRepository<TicketEntity, String> {
    List<TicketEntity> findByUserId(String userId);
    List<TicketEntity> findByVehicleId(String vehicleId);
}
