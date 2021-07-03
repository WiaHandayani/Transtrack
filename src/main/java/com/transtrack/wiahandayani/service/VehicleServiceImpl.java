package com.transtrack.wiahandayani.service;

import com.transtrack.wiahandayani.model.VehicleModel;
import com.transtrack.wiahandayani.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepo vehicleRepo;

    @Override
    public List<VehicleModel> getAllVehicle() {
        return vehicleRepo.findAll();
    }

    @Override
    public VehicleModel saveVehicle(VehicleModel vehicleModel) {
        this.vehicleRepo.save(vehicleModel);
        return vehicleModel;
    }

    @Override
    public void deleteVehicleById(Integer id) {
        this.vehicleRepo.deleteById(id);
    }

    @Override
    public VehicleModel getVehicleById(Integer id) {
        Optional<VehicleModel> optional = vehicleRepo.findById(id);
        VehicleModel vehicleModel = null;
        if (optional.isPresent()) {
            vehicleModel = optional.get();
        } else {
            throw new RuntimeException(" Book not found for id :: " + id);
        }
        return vehicleModel;
    }
}
