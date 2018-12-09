package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Class which run all tests from scenario.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Features",                                      //Specifies where the features files with test scenarios are stored
        glue = {"amazontests"},                                         //Specifies where the tests are stored
        format = {"pretty","html:reports/test-report"},                 //Specifies where and how test reports will be created
        tags = "@smokeTest"                                             //Annotation for localization of Scenario
)

public class CucumberRunner { }