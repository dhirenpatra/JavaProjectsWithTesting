package org.dhiren.java.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/java/org/dhiren/java/features"},
        glue = {"org.dhiren.java.steps", "org.dhiren.java.hooks"},
        tags = {"@BillGenerationMultipleTest"},
        plugin = {"pretty"})
public class BillGenerationTest {

}
