package com.example.ReportGenerate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ReportGenerator reportGenerator() {
        return new PDFReportGenerator();
    }

    public ReportService reportService(ReportGenerator reportGenerator) {
        return new ReportService(reportGenerator);
    }
}
