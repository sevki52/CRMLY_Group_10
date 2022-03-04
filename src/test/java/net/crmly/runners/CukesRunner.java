package net.crmly.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "net/crmly/step_definitions",
        dryRun = false,
<<<<<<<<< Temporary merge branch 1
        tags = "@smoke"
=========
        tags = "@CRMLYEUG-920"
>>>>>>>>> Temporary merge branch 2

)

public class CukesRunner {

}
