package com.transtrack.wiahandayani.service;

import com.transtrack.wiahandayani.model.SparepartModel;

import java.util.List;

public interface SparepartService {
    List<SparepartModel> getAllSparepart();
    SparepartModel saveSparepart(SparepartModel sparepartModel);
    void deleteSparepartById(Integer id);
    SparepartModel getSparepartById(Integer id);
}
