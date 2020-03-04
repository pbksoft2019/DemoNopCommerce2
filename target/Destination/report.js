$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/sortHighToLow.feature");
formatter.feature({
  "name": "user should be able to short price from high to low",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to sort product price High to Low successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sortHighToLow"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.CompareStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Book Category",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.CompareStepDefs.user_click_on_Book_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Filter Sort By",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.SortHighToLowStepDefs.click_on_Filter_Sort_By()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Price High to Low",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.SortHighToLowStepDefs.select_Price_High_to_Low()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to sort price High to Low",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.SortHighToLowStepDefs.user_should_be_able_to_sort_price_High_to_Low()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});