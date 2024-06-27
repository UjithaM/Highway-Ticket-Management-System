package com.ujitha.vehicle_service.dao;

import com.ujitha.vehicle_service.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepo extends JpaRepository<VehicleEntity, String>{
    List<VehicleEntity> findByUserId(String userId);
}
