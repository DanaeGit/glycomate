package com.example.glycomate.repository;

import com.example.glycomate.model.GlucoseModel;
import java.util.ArrayList;
import java.util.List;

public class GlucoseRepository {
    private final List<GlucoseModel> glucoseData = new ArrayList<>();

    public void addGlucoseData(GlucoseModel data) {
        glucoseData.add(data);
    }

    public List<GlucoseModel> getAllGlucoseData() {
        return glucoseData;
    }
}
