Feature: Performance
Scenario: Adding Performance cycle to employee

Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to HR>>Review cycle
And :Add review cycle period
And :Click on Ok button in Allert
And :Navigate to Employee
And :Click on employeeCode hyperlink and click on Performance
And :Add the Performance
And :Click on Ok button in Allert
And :Add the Performance goals
And :Click on Ok button in Allert
And :Click on Set Final goal
And :Click on Ok button in Allert
And :Click on Ok button in Allert
And :Enter Appraise comments based on questions
And :Enter the Appraiser comments 
And :Enter the marks for employee based on Gole type
  