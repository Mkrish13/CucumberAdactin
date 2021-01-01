package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static  void generateJvmReport(String jsonFile) {
		Configuration configuration = new Configuration(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report"),
				"Adactin Automation");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint", "13");
		configuration.addClassifications("OS", "Windows");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
	}

}
