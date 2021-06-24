package StepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {"@withoutpartnerwithbenefits"}, dryRun = false)

    public class Run
    {

    }


