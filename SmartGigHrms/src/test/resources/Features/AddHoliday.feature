Feature: Holiday

Scenario: Check whether is Holoiday is added successfully

Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to HR>>Holiday
And :Click on Add Holiday
And :Enter all required details
And :Click on Submit_Holiday button
And :Click on Ok button in Allert
Then :Check Holiday should be added