package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\login\\login.feature"},glue = {"definition"},tags = "@NegativeTesting",plugin = {"html:report/myreport.html"})
public class test_runner {
     
    }

