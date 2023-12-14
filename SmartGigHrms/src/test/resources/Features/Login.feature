Feature: Login functionality

Scenario: Login with valid credentials 

Given :Open Url "https://ies-hrms.azurewebsites.net/"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
Then :Check Dashboard screen should display