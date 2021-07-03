package com.transtrack.wiahandayani.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "spareparts")
public class SparepartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sparepart_id",nullable = false, unique = true)
    private String sparepart_id;

    @Column(name = "sparepart_name")
    private String sparepartName;

    @Column(name = "stock")
    private Integer stock;
}
