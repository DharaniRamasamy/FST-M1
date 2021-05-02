$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Activity1_1.feature");
formatter.feature({
  "line": 2,
  "name": "First Test",
  "description": "",
  "id": "first-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Opening a webpage using Selenium",
  "description": "",
  "id": "first-test;opening-a-webpage-using-selenium",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Google Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User types in Cheese and hits ENTER",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Show how many search results were shown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.userIsOnGooglePage()"
});
formatter.result({
  "duration": 8088783700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.userTypesInCheeseAndHitsENTER()"
});
formatter.result({
  "duration": 280160700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.showHowManySearchResultsWereShown()"
});
formatter.result({
  "duration": 1366841700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.closeTheBrowser()"
});
formatter.result({
  "duration": 1735241800,
  "status": "passed"
});
formatter.uri("Activity1_3.feature");
formatter.feature({
  "line": 2,
  "name": "Testing with Tags",
  "description": "",
  "id": "testing-with-tags",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_3"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Test for Simple Alert",
  "description": "",
  "id": "testing-with-tags;test-for-simple-alert",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SimpleAlert"
    },
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks the Simple Alert button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Alert opens",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Read the text from it and print it",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the alert",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "AlertTestSteps.user_is_on_the_page()"
});
formatter.result({
  "duration": 7930596400,
  "status": "passed"
});
formatter.match({
  "location": "AlertTestSteps.user_clicks_the_Simple_Alert_button()"
});
formatter.result({
  "duration": 136981200,
  "status": "passed"
});
formatter.match({
  "location": "AlertTestSteps.alert_opens()"
});
formatter.result({
  "duration": 6582900,
  "status": "passed"
});
formatter.match({
  "location": "AlertTestSteps.read_the_text_from_it_and_print_it()"
});
formatter.result({
  "duration": 7264200,
  "status": "passed"
});
formatter.match({
  "location": "AlertTestSteps.close_the_alert()"
});
formatter.result({
  "duration": 67668900,
  "status": "passed"
});
formatter.match({
  "location": "AlertTestSteps.close_Browser()"
});
formatter.result({
  "duration": 1683108300,
  "status": "passed"
});
});