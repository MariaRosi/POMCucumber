$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Maria/Selenium/Workspace/POMCucumber/src/main/java/feature/loginAndHome.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login and Home Feature",
  "description": "",
  "id": "free-crm-login-and-home-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test and Home Scenario",
  "description": "",
  "id": "free-crm-login-and-home-feature;free-crm-login-test-and-home-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "do the login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate correct user logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.open_the_browser()"
});
formatter.result({
  "duration": 9366139949,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.validate_page_title()"
});
formatter.result({
  "duration": 133513175,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.do_the_login()"
});
formatter.result({
  "duration": 10567693277,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.validate_home_page_title()"
});
formatter.result({
  "duration": 32757177,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.validate_correct_user_logged_in()"
});
formatter.result({
  "duration": 204934162,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndHomeStepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 685039392,
  "status": "passed"
});
});