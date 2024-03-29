package com.tremend.practice;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

//        "com.epam.reportportal.cucumber.StepReporter" to add to plugins for reportPortal integration
        plugin = {"pretty", "com.epam.reportportal.cucumber.StepReporter"},
        features = {"src/test/resources/features"},
        glue = {"com.tremend.practice.keywords"}






)

public class CucumberTestSuite {
//    maven terminal command for running zalenium: mvn clean verify serenity:aggregate -Dcucumber.options="--tags '@smoke and @fe'" -Denvironment=integration -Dwebdriver.driver=remote
}