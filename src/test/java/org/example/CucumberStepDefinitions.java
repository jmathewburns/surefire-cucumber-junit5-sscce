package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CucumberStepDefinitions {
    @Given("working glue")
    public void working_glue() {
        System.out.println("Glue works");
    }

    @Then("should work")
    public void should_work() {
        System.err.println("True assertion step run");
        assertTrue(true);
    }

    @Then("should fail")
    public void should_fail() {
        System.err.println("fail() step run");
        fail();
    }
}
