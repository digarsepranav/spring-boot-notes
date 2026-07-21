package com.example.ReportGenerate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ReportGeneratorApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService reportService = applicationContext.getBean(ReportService.class);
		reportService.createReport();
	}

}

/*
ApplicatoinContext created the spring container and the class defined in its params is the class which is used to create the beans
we have to store the object or bean created by spring of reportService class in a variable
we run the method described in that.

here beans are created and injected at the Main
ReportService or Main no one created the object of the interface like the pdfReport by themselves it is created by spring and stored in spring container that is then fetched by the Main class object.
 */