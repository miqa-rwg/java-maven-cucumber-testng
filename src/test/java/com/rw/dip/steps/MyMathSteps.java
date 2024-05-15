package com.rw.dip.steps;

import com.rw.dip.MyMath;
import com.rw.dip.context.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;


public class MyMathSteps {

    private static final String ACTUAL_RESULT = "result";


    @Given("I sum numbers {int} and {int}")
    public void iSumNumbersAnd(int a, int b) {
        Context.put(ACTUAL_RESULT, MyMath.sum(a, b));
    }


    @When("I get result equals {int}")
    public void iGetResultEquals(int expectedResult) {
        assertEquals(Integer.valueOf(expectedResult), Context.get(ACTUAL_RESULT, Integer.class));
    }
}
