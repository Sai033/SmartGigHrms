Feature: Employee
Scenario: Adding a new Employee
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to HR>>Employee
And :Click on Add Employee
And :Enter all required details related to Employee
And :Click on empSave button
And :Click on Ok button in Allert