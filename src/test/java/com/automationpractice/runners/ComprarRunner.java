package com.automationpractice.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/automationpractice/features/Comprar.feature", glue = "com.automationpractice.stepdefinitions", format = {"json:target/cucumber.json"}, snippets = SnippetType.CAMELCASE)
public class ComprarRunner {

}
