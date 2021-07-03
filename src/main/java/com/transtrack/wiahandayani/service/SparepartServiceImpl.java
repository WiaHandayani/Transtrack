package com.transtrack.wiahandayani.service;


import com.transtrack.wiahandayani.model.SparepartModel;
import com.transtrack.wiahandayani.repository.SparepartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SparepartServiceImpl implements SparepartService {

    @Autowired
    SparepartRepo sparepartRepo;

    @Override
    public List<SparepartModel> getAllSparepart() {
        return sparepartRepo.findAll();
    }

    @Override
    public SparepartModel saveSparepart(SparepartModel sparepartModel) {
        this.sparepartRepo.save(sparepartModel);
        return sparepartModel;
    }

    @Override
    public void deleteSparepartById(Integer id) {
        this.sparepartRepo.deleteById(id);
    }

    @Override
    public SparepartModel getSparepartById(Integer id) {
        Optional<SparepartModel> optional = sparepartRepo.findById(id);
        SparepartModel sparepartModel = null;
        if (optional.isPresent()) {
            sparepartModel = optional.get();
        } else {
            throw new RuntimeException(" Book not found for id :: " + id);
        }
        return sparepartModel;
    }
}
