package com.rw.dip.steps;

import com.rw.dip.context.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;


public class ContextSteps {

    @Given("Using {}, I put {} in the context")
    public void usingIPutInTheContext(String key, String value) {
        Context.put(key, convertValueToType(key, value));
    }

    @When("Using {}, I get value from the context")
    public void usingIGetFromContext(String key) {
        Object object = Context.get(key, Object.class);
        System.out.println(object);
        assert object != null;
        assertEquals(key, object.getClass().getSimpleName().toLowerCase());
    }

    @And("Using {}, I update value in the context")
    public void usingIUpdateValueInTheContext(String key) {
        Object object = Context.get(key, Object.class);
        if (object instanceof Integer)
            Context.update(key, (Integer) object + 1);
        if (object instanceof String)
            Context.update(key, object + "1");
        if (object instanceof Boolean)
            Context.update(key, !(Boolean) object);
        if (object instanceof Float)
            Context.update(key, (Float) object + 1);
    }

    @And("Using {}, I remove value from the context")
    public void usingIRemoveValueFromTheContext(String key) {
        Context.remove(key);
        assertNull(Context.get(key, Object.class));
    }

    private Object convertValueToType(String key, String value) {
        return switch (key) {
            case "integer" -> Integer.parseInt(value);
            case "string" -> value;
            case "boolean" -> Boolean.getBoolean(value);
            case "float" -> Float.parseFloat(value);
            default -> throw new RuntimeException("Oops! Unexpected type!\n" + key);
        };
    }
}
