$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/BankAndcash.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Bankcashfeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "    and open a new account",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Bankcashscenario1"
    }
  ]
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the \"username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalanc",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "loan",
        "mortgage",
        "2000,0000",
        "67543289",
        "James",
        "972-567-8898",
        "https://www.pnc.com"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginstepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class steps.LoginstepDefinition\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 32 more\r\nCaused by: java.lang.Error: Unresolved compilation problems: \n\tThe import pages.Loginpage cannot be resolved\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tLoginpage cannot be resolved to a type\n\tSyntax error, insert \"}\" to complete ClassBody\n\tLoginpage cannot be resolved\n\tLoginpage cannot be resolved\n\tSyntax error, insert \";\" to complete Statement\n\tSyntax error, insert \"}\" to complete Block\n\tSyntax error, insert \"}\" to complete MethodBody\n\r\n\tat steps.LoginstepDefinition.\u003cinit\u003e(LoginstepDefinition.java:9)\r\n\t... 37 more\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "    and open a new account",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Bankcashfeature"
    },
    {
      "name": "@Bankcashscenario1"
    }
  ]
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the \"username\" field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters the \"abc123\" in the \"password\" field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"loan\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"mortgage\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"67543289\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"James\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"972-567-8898\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"https://www.pnc.com\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});