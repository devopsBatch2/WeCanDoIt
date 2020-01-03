package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report","pretty","json:target/cucumber.jsonmvn"},
        //provide me report in html format,it will saved in target folder
        //all reports will under cucumberHTML-report
        features = {"src/test/resources/uiFeatures","src/test/resources/dbFeatures"},//provide to our scenario
        glue = "stepDefs",//direction of methods
        dryRun = false,
        tags = {"@Postman_WP"}
)
public class UITestRunner {

}







