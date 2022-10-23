package net.hikmetcavus.garage.service.garage.model;

import lombok.Data;
import net.hikmetcavus.garage.model.enums.VehicleEnum;

@Data
public class Vehicle {
    private String plate;
    private String color;
    private VehicleEnum vehicleType;
}
