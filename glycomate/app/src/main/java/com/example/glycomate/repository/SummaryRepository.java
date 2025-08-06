package com.example.glycomate.repository;

import com.example.glycomate.model.SummaryModel;

public class SummaryRepository {
    private SummaryModel latestSummary;

    public void saveSummary(SummaryModel summary) {
        this.latestSummary = summary;
    }

    public SummaryModel getLatestSummary() {
        return latestSummary;
    }
}
