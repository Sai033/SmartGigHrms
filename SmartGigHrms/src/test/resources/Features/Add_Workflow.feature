Feature: WorkFolow for Leave approval

Scenario: Adding workflow for leave approval
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on WorkFlow icon
And :Click on Add New workflow
And :Enter all workflow required details and click on save button
And :Click on Ok button in Allert
