package net.hikmetcavus.garage.service.garage;

import net.hikmetcavus.garage.model.resp.GarageResponse;
import net.hikmetcavus.garage.resources.garage.model.VehicleInput;

public interface GarageService {

    GarageResponse<String> park(VehicleInput input);
    GarageResponse<String> leave(Integer ticketNumber);
    GarageResponse<String> status();
    GarageResponse<String> clearCache();
}
