package com.gemini.generic.testRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "com.gemini.generic", tags = "@changeDefaultLayout")
public class TestRunner {
}

