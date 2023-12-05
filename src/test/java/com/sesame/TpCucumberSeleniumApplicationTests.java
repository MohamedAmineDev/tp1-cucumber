package com.sesame;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources"},
        glue = {""},
        plugin = {"json:target/cucumber.json"}
)
public class TpCucumberSeleniumApplicationTests {
}
