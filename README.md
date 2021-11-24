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

First Layer :
Feature File - Test Cases written in plain english

Second Layer :
Step Definitions - feature file binded with step definitions where only method mentioned
Step Definition is a java method which runs against the matched Gherkin step. Usually gets annotated with @Given, @When, @And, @Then. Cucumber finds these methods with the help of "glue" (java package) code in Cucumber Options.

Third Layer :

Page Objects - Page Objects help to ease the maintenance and always inherits Page Object Design Pattern.
Contains Feature Specific Info.

This framework contains sample code containing:
1 feature (feature file)
3 Scenarios
Scenarios covered end to end flow of the assignment


#Installation Prerequisite

1. Clone the repository from GIT HUB
   a. https://github.com/sutapamaji/weathershopperassignment
   b. Command : git clone https://github.com/sutapamaji/weathershopperassignment.git
2. Open "weathershopperassignment" project in Intellij IDE
   1. Prerequisite Java 8 should be installed the system
   2. Supported OS (mac and windows)
   3. Supported Browser (Google Chrome and Firefox)
3. Wait for all the dependency to be installed automatically
4. Steps to execute test:
   a. Go to ServiceHooks class select preferred browser (default browser Google Chrome)
   b. Goto endtoendtestcases.feature to start the execution.
   c. Scenario can be executed independently and complete feature at a time as well.
   ![](../../../Desktop/Screenshot 2021-11-24 at 2.50.22 PM.png)
5. 

