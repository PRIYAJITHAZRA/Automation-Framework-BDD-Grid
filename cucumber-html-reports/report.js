$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login to HP Webtour",
  "description": "I want to use this template for my feature file",
  "id": "login-to-hp-webtour",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Login with correct username and password",
  "description": "",
  "id": "login-to-hp-webtour;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given Open browser"
    }
  ],
  "line": 26,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I enter \"username\" and \"password\" for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28
    },
    {
      "cells": [
        "yellow",
        "Password123"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("juven.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Priyajit Hazra"
    }
  ],
  "line": 3,
  "name": "Sanity testing of Sample Application with Sample-Collection.",
  "description": "I want to use this template for my feature file",
  "id": "sanity-testing-of-sample-application-with-sample-collection.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Test To Check whether  Sample Collection request processed sucessfully in Sample Applicatio.",
  "description": "",
  "id": "sanity-testing-of-sample-application-with-sample-collection.;test-to-check-whether--sample-collection-request-processed-sucessfully-in-sample-applicatio.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Operation_1",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Operation_2",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Operation_3",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});