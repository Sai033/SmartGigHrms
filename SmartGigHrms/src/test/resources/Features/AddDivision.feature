Feature: Division

Scenario: Adding Division
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Division icon
And :Click on Add Division
And :Enter all division required details and click on save button
And :Click on Ok button in Allert