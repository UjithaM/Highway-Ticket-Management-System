package com.ujitha.vehicle_service.service.impl;

import com.ujitha.vehicle_service.dto.VehicleDTO;
import com.ujitha.vehicle_service.service.VehicleService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceIMPL implements VehicleService {
    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
        return null;
    }

    @Override
    public void deleteVehicle(String vehicleId) {

    }

    @Override
    public VehicleDTO getSelectedVehicle(String vehicleId) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return null;
    }

    @Override
    public void updateVehicle(String vehicleId, VehicleDTO vehicleDTO) {

    }
}
