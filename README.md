# weathershopperassignment

Assignment completed using BDD Framework
BDD Framework Implementations using Cucumber + Selenium in Java

Cucumber Feature File
Describe your tests here in simple english following Gherkin syntax, which can later serve as automation test script as well as user stories document. Cucumber finds the *.feature file with the help of "features" code in Cucumber Options.
Keywords (reference: https://docs.cucumber.io/gherkin/reference/)
The primary keywords are:

Feature
Example (Scenario and Scenario Outline are synonyms)
Given, When, Then, And, But (steps)

# Code Structure
Feature File - Test Cases written in plain english
Step Definitions - Java code to verify the steps written in feature file
Step Definition is a java method which runs against the matched Gherkin step. Usually gets annotated with @Given, @When, @And, @Then. Cucumber finds these methods with the help of "glue" (java package) code in Cucumber Options.
Page Objects - Page Objects help to ease the maintenance and always inherits Page Object Design Pattern.
Contains Feature Specific Info.

This framework contains sample code containing:
1 feature (feature file)
3 Scenarios
Scenarios covered end to end flow of the assignment