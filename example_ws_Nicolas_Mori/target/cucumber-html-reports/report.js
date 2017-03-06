$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Case_1A2.feature");
formatter.feature({
  "line": 2,
  "name": "Interview Nicolas Mori",
  "description": "",
  "id": "interview-nicolas-mori",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@Case_1A2"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Get a random user (userID) , print its address to output and verify email format is correct",
  "description": "",
  "id": "interview-nicolas-mori;get-a-random-user-(userid)-,-print-its-address-to-output-and-verify-email-format-is-correct",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I start the android native calculator with this device \"\u003cdevice uuid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "access the number \"\u003cfirst number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "press the symbol \"\u003csymbol\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "access the number \"\u003csecond number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "press the symbol \"\u003cequal\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "show the result per console",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "interview-nicolas-mori;get-a-random-user-(userid)-,-print-its-address-to-output-and-verify-email-format-is-correct;",
  "rows": [
    {
      "cells": [
        "device uuid",
        "first number",
        "second number",
        "symbol",
        "equal"
      ],
      "line": 14,
      "id": "interview-nicolas-mori;get-a-random-user-(userid)-,-print-its-address-to-output-and-verify-email-format-is-correct;;1"
    },
    {
      "cells": [
        "266DE50BB1144087B603D03CE45E7C37",
        "100",
        "20",
        "+",
        "\u003d"
      ],
      "line": 15,
      "id": "interview-nicolas-mori;get-a-random-user-(userid)-,-print-its-address-to-output-and-verify-email-format-is-correct;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Get a random user (userID) , print its address to output and verify email format is correct",
  "description": "",
  "id": "interview-nicolas-mori;get-a-random-user-(userid)-,-print-its-address-to-output-and-verify-email-format-is-correct;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@Case_1A2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I start the android native calculator with this device \"266DE50BB1144087B603D03CE45E7C37\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "access the number \"100\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "press the symbol \"+\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "access the number \"20\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "press the symbol \"\u003d\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "show the result per console",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "266DE50BB1144087B603D03CE45E7C37",
      "offset": 56
    }
  ],
  "location": "StepsMobile.accessTheAndroid(String)"
});
formatter.result({
  "duration": 177580846150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 19
    }
  ],
  "location": "StepsMobile.accessTheNumber(String)"
});
formatter.result({
  "duration": 589510,
  "error_message": "java.lang.NullPointerException\n\tat com.demo.nicolas.mori.framework.DSL.click(DSL.java:26)\n\tat com.demo.nicolas.mori.page.object.CalculatorHomePage.pressInTheNumber(CalculatorHomePage.java:81)\n\tat com.demo.nicolas.mori.steps.StepsMobile.accessTheNumber(StepsMobile.java:22)\n\tat ✽.And access the number \"100\"(Case_1A2.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "+",
      "offset": 18
    }
  ],
  "location": "StepsMobile.makeClickInTheSymbol(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 19
    }
  ],
  "location": "StepsMobile.accessTheNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003d",
      "offset": 18
    }
  ],
  "location": "StepsMobile.makeClickInTheSymbol(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsMobile.getTheTotalInTheCalculator()"
});
formatter.result({
  "status": "skipped"
});
});