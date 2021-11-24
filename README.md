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


# Installation Prerequisite

1. Clone the repository from GIT HUB
   a. https://github.com/sutapamaji/weathershopperassignment
   b. Command : git clone https://github.com/sutapamaji/weathershopperassignment.git
2. Open "weathershopperassignment" project in Intellij IDE
   1. Prerequisite Java 8 should be installed the system
   2. Supported OS (mac and windows)
   3. Supported Browser (Google Chrome and Firefox)
3. Wait for all the dependency to be installed automatically
4. Go to plugins and Install Cucumber plugin (if not installed automatically)

# Steps to execute test:
   a. Go to ServiceHooks class select preferred browser (default browser selected as Google Chrome)
   ![image](https://user-images.githubusercontent.com/72621415/143213860-b0d19abd-9832-4b9a-b2f7-39ea35128cee.png)

   b. Goto endtoendtestcases.feature to start the execution.
   ![image](https://user-images.githubusercontent.com/72621415/143213928-1bb71a8a-3bec-49bc-96ea-2390ca73fd2c.png)

   c. Scenario can be executed independently and complete feature at a time as well.
      To execute complete feature execute Feature "Complete the moisturizer/sunscreens shopping based on weather from weather shopper Website"
      ![image](https://user-images.githubusercontent.com/72621415/143213340-0bfcbb6e-7876-438e-844e-02ae593c706d.png)
      
   d.To execute individual Scenario execute any scenario independently:
      ![image](https://user-images.githubusercontent.com/72621415/143213630-f4b15117-2de8-4a51-b807-5ede2214dcd9.png)

      


