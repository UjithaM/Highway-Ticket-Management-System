package com.ujitha.vehicle_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vehicle")
@Entity
public class VehicleEntity implements SuperEntity{
    @Id
    private String vehicleId;
    private String licensePlate;
    private String brand;
    private String model;
    private String userId;
}
