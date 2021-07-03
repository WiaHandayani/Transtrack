package com.transtrack.wiahandayani.controller;

import com.transtrack.wiahandayani.model.SparepartModel;
import com.transtrack.wiahandayani.repository.SparepartRepo;
import com.transtrack.wiahandayani.service.SparepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sparepart")
public class SparepartController {

    @Autowired
    private SparepartRepo sparepartRepo;

    @Autowired
    SparepartService sparepartService;

    @GetMapping("/showdata")
    public List<SparepartModel> getAllSparepart() {
        return sparepartRepo.findAll();
    }

    @PostMapping("/saveSparepart")
    public void saveSparepart(@ModelAttribute("sparepart") SparepartModel sparepartModel) {
        sparepartService.saveSparepart(sparepartModel);
    }
    @GetMapping("/updateSparepart/{id}")
    public void updateSparepart(@PathVariable( value = "id") Integer kode) {
        SparepartModel sparepartModel = sparepartService.getSparepartById(kode);
    }

    @GetMapping("/deleteSparepart/{id}")
    public void deleteSparepart(@PathVariable (value = "id") Integer kode) {
        this.sparepartService.deleteSparepartById(kode);
    }


}
