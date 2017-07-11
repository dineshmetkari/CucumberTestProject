package com.stackroute.cucumberproject.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/cucumber.json"},
		features = {"src/main/test"}
		)
public class CucumberRunner {

}
