package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/chrome.feature", 
				glue = "tests", 
		tags = "@executa",
				dryRun = false,
plugin = {"pretty", "html:target/report.html" }, 

monochrome = true

)

public class Executa {

}
