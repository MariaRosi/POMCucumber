package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
	    //this code will only look into "features/" folder for features
	    features={"D:\\Maria\\Selenium\\Workspace\\POMCucumber\\src\\main\\java\\feature\\loginAndHome.feature"},
	    glue = { "stepdefinition" },
	    format = {"pretty","html:test-output"},
	    dryRun=false,
	    monochrome=true,
	    strict=true
	    )



public class TestRunner {
	


}
