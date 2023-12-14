Feature: Add Leave

Scenario: Adding Leave
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "J.sai"
And :Enter valid Password "Demo@1234567"
And :Click on Submit button
And :Navigate to Myrequests>>Leave sub module
And :Click on Add leave
And :Print the Balance Casual Leaves
And :Enter all required details related to Leave and click on save button
And :Click on Ok button in Allert