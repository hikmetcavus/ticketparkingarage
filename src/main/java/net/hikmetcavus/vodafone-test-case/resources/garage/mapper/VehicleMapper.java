package net.hikmetcavus.garage.resources.garage.mapper;

import net.hikmetcavus.garage.resources.garage.model.VehicleInput;
import net.hikmetcavus.garage.service.garage.model.Vehicle;

public class VehicleMapper {

    public static Vehicle toVehicle(VehicleInput input) {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlate(input.getPlate());
        vehicle.setColor(input.getColor());
        vehicle.setVehicleType(input.getVehicleType());
        return vehicle;
    }

}
