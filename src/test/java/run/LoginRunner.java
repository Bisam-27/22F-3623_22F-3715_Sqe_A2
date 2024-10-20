package run;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature/login.feature",
    glue = {"stepdefinitions"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
    publish = true
)
public class LoginRunner {
}
