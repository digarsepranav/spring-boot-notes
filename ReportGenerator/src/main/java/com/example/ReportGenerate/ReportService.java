package com.example.ReportGenerate;

public class ReportService {
    private final ReportGenerator reportGenerator;

    public ReportService(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
    public void createReport() {
        reportGenerator.generateReport();
    }
}
