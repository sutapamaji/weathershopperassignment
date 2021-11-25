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

weathershopperassignment framework structured in three layers

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

# Manual Test cases

Detail steps of manual test cases written in ManualTestCaseInDetail file

Path : weathershopperassignment/flink-assignment/src/test/java/features/ManualTestCaseInDetail

In feature file scenario wise end to end cases are covered , inside code both product categories cover as per requirement

Path : weathershopperassignment/flink-assignment/src/test/java/features/endtoendtestcases.feature

# Installation Prerequisite

1. Clone the repository from GIT HUB
   a. https://github.com/sutapamaji/weathershopperassignment
   b. Command : git clone https://github.com/sutapamaji/weathershopperassignment.git
2. Open "weathershopperassignment" project in Intellij IDE
   1. Prerequisite Java 8 should be installed the system
   2. Supported OS (mac and windows)
   3. Supported Browser (Google Chrome (version 96) and Firefox)
      1.Note: After changing browser if IDE not recognising ,please clean and build the solution once.
   4. Important : Please change the Chrome version In TestBase.java class (line no : 27) if runnable system having different chrome version
3. Wait for all the dependency to be installed automatically
4. Important : Go to plugins and Install Cucumber plugin (if not installed automatically)


# Steps to execute test:
   a. Go to ServiceHooks class select preferred browser (default browser selected as Google Chrome)
   
   Path : weathershopperassignment/flink-assignment/src/main/java/com/definitions/ServiceHooks.java
   
   ![image](https://user-images.githubusercontent.com/72621415/143213860-b0d19abd-9832-4b9a-b2f7-39ea35128cee.png)

   b. Go to endtoendtestcases.feature to start the execution. In the left start button will be availble for the feature , please click on Run the Test.
    
    Path : weathershopperassignment/flink-assignment/src/test/java/features/endtoendtestcases.feature
    
   ![image](https://user-images.githubusercontent.com/72621415/143213928-1bb71a8a-3bec-49bc-96ea-2390ca73fd2c.png)

   c. Scenario can be executed independently and with the complete feature at a time as well.
      To execute complete feature execute Feature "Complete the moisturizer/sunscreens shopping based on weather from weather shopper Website"
    <img width="978" alt="Screenshot 2021-11-24 at 10 23 27 PM" src="https://user-images.githubusercontent.com/72621415/143281414-77c15f46-6194-4694-a691-f73f861b7ebf.png">

      
   d.To execute individual Scenario, select any scenario , click the start button and Run the Test.
   
   <img width="978" alt="Screenshot 2021-11-24 at 10 18 38 PM" src="https://user-images.githubusercontent.com/72621415/143280794-5f61f781-bb25-4ee7-b20f-df639390de51.png">

    

      


