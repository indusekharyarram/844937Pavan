Feature: taskmanager

Scenario: Login to the TaskManager

Given launch the browser
When open TaskManager website
Then enter Username and Password 
And  click on Login button


Scenario: Add Project to the TaskManager Website

Given Open the Website in the Browser
When Click on the Projects
Then Click on the Add New Project
Then Enter the Project Name 
And Click on the Add Button


Scenario: Search the  New Project

Given Open the website in the Browser
When  Click On Task List
When  Select the Newly Entered Project
And Click on the Search button


Scenario: Add Task to the  Newly entered Project

Given Launch the Website in the Browser
When  Click on the AddNewTask
Then Enter all the details
Then Slect the Start Date
Then Select the End Date
Then Click on the Add button
And Take screenshot
