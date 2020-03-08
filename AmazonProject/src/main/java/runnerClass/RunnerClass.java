package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Soumick\\eclipse-workspace\\AmazonProject\\src\\main\\java\\feature\\LoginFeature.feature", 
				 glue="stepDefinitions",
				 dryRun=false)
public class RunnerClass {

}
