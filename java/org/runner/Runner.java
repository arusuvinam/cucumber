package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Arunima\\eclipse-workspace1\\Cucumber\\src\\test\\resources\\FeatureFile",glue= "org.step",monochrome=true,dryRun=false,strict=false,snippets=SnippetType.UNDERSCORE,tags={"@smoke"})
public class Runner {

}
