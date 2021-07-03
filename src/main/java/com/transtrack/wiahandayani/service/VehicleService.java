package com.transtrack.wiahandayani.service;

import com.transtrack.wiahandayani.model.SparepartModel;
import com.transtrack.wiahandayani.model.VehicleModel;

import java.util.List;

public interface VehicleService {

    List<VehicleModel> getAllVehicle();
    VehicleModel saveVehicle(VehicleModel vehicleModel);
    void deleteVehicleById(Integer id);
    VehicleModel getVehicleById(Integer id);
}
