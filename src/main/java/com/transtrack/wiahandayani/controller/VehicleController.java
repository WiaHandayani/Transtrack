package com.transtrack.wiahandayani.controller;

import com.transtrack.wiahandayani.model.VehicleModel;
import com.transtrack.wiahandayani.repository.VehicleRepo;
import com.transtrack.wiahandayani.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/showdata")
    public List<VehicleModel> getAllVehicle() {
        return vehicleRepo.findAll();
    }

    @PostMapping("/saveVehicle")
    public void saveVehicle(@ModelAttribute("vehicle") VehicleModel vehicleModel {
        vehicleService.saveVehicle(vehicleModel);
    }
    @GetMapping("/update/{id}")
    public void updateVehicle(@PathVariable( value = "id") Integer kode) {
        VehicleModel vehicleModel = vehicleService.getVehicleById(kode);
    }

    @GetMapping("/delete/{id}")
    public void deleteVehicle(@PathVariable (value = "id") Integer kode) {
        this.vehicleService.deleteVehicleById(kode);
    }
}
