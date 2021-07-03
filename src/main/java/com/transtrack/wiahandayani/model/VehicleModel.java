package com.transtrack.wiahandayani.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id",nullable = false, unique = true)
    private String vehicle_id;

    @Column(name = "vehicle_name")
    private String vehicleName;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "color_id")
    private Integer clorId;

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getClorId() {
        return clorId;
    }

    public void setClorId(Integer clorId) {
        this.clorId = clorId;
    }
}
