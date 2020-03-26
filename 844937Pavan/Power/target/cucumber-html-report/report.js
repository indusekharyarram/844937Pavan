$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcase.feature");
formatter.feature({
  "line": 1,
  "name": "taskmanager",
  "description": "",
  "id": "taskmanager",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to the TaskManager",
  "description": "",
  "id": "taskmanager;login-to-the-taskmanager",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open TaskManager website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSd.launch_the_browser()"
});
formatter.result({
  "duration": 79288380800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSd.open_TaskManager_website()"
});
formatter.result({
  "duration": 61251822966,
  "status": "passed"
});
formatter.match({
  "location": "LoginSd.enter_Username_and_Password()"
});
formatter.result({
  "duration": 1954077546,
  "status": "passed"
});
formatter.match({
  "location": "LoginSd.click_on_Login_button()"
});
formatter.result({
  "duration": 27444388849,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add Project to the TaskManager Website",
  "description": "",
  "id": "taskmanager;add-project-to-the-taskmanager-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Open the Website in the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on the Projects",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click on the Add New Project",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Project Name",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on the Add Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddProjectSd1.open_the_Website_in_the_Browser()"
});
formatter.result({
  "duration": 31653240180,
  "status": "passed"
});
formatter.match({
  "location": "AddProjectSd1.click_on_the_Projects()"
});
formatter.result({
  "duration": 2255853528,
  "status": "passed"
});
formatter.match({
  "location": "AddProjectSd1.click_on_the_Add_New_Project()"
});
formatter.result({
  "duration": 8892229902,
  "status": "passed"
});
formatter.match({
  "location": "AddProjectSd1.enter_the_Project_Name()"
});
formatter.result({
  "duration": 140944498,
  "status": "passed"
});
formatter.match({
  "location": "AddProjectSd1.click_on_the_Add_Button()"
});
formatter.result({
  "duration": 10818660575,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search the  New Project",
  "description": "",
  "id": "taskmanager;search-the--new-project",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Open the website in the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Click On Task List",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Select the Newly Entered Project",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Click on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSd.open_the_website_in_the_Browser()"
});
formatter.result({
  "duration": 16914402618,
  "status": "passed"
});
formatter.match({
  "location": "SearchSd.click_On_Task_List()"
});
formatter.result({
  "duration": 1198123176,
  "status": "passed"
});
formatter.match({
  "location": "SearchSd.select_the_Newly_Entered_Project()"
});
formatter.result({
  "duration": 301146304,
  "status": "passed"
});
formatter.match({
  "location": "SearchSd.click_on_the_Search_button()"
});
formatter.result({
  "duration": 15213568024,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Add Task to the  Newly entered Project",
  "description": "",
  "id": "taskmanager;add-task-to-the--newly-entered-project",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Launch the Website in the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Click on the AddNewTask",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Enter all the details",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Slect the Start Date",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select the End Date",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click on the Add button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "AddTaskSd1.launch_the_Website_in_the_Browser()"
});
formatter.result({
  "duration": 23405939924,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.click_on_the_AddNewTask()"
});
formatter.result({
  "duration": 12098006221,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.enter_all_the_details()"
});
formatter.result({
  "duration": 1711324631,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.slect_the_Start_Date()"
});
formatter.result({
  "duration": 8593429371,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.select_the_End_Date()"
});
formatter.result({
  "duration": 2587603170,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.click_on_the_Add_button()"
});
formatter.result({
  "duration": 3678197444,
  "status": "passed"
});
formatter.match({
  "location": "AddTaskSd1.take_screenshot()"
});
formatter.result({
  "duration": 23432760566,
  "status": "passed"
});
});