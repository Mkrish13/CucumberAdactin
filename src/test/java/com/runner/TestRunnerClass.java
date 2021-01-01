package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"com.stepDefinition" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"json:src\\test\\resources\\Report\\cucumber.json" })
public class TestRunnerClass {
	@AfterClass
	public static void afterclass() {
		JVMReport.generateJvmReport((System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Report\\cucumber.json"));
	}

}
