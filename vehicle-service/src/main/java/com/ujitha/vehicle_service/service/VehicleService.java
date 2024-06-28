package com.ujitha.vehicle_service.service;

import com.ujitha.vehicle_service.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    VehicleDTO saveVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String vehicleId);
    VehicleDTO getSelectedVehicle(String vehicleId);
    List<VehicleDTO> getAllVehicle();
    void updateVehicle(String vehicleId,VehicleDTO vehicleDTO);
    List<VehicleDTO> getVehicleByUserId(String userId);
    boolean isVehicleExists(String vehicleId);
}
