package com.ujitha.vehicle_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private String vehicleId;
    private String licensePlate;
    private String brand;
    private String model;
    private String userId;
}
