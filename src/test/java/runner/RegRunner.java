package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	glue="steps",
	features="src\\test\\resources\\Features\\regression",
	monochrome=true,
	stepNotifications=true,
	tags="@tag0528"
		
		)
public class RegRunner {

}
