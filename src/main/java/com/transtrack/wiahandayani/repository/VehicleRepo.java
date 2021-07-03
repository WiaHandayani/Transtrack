package com.transtrack.wiahandayani.repository;

import com.transtrack.wiahandayani.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<VehicleModel, Integer> {
}
