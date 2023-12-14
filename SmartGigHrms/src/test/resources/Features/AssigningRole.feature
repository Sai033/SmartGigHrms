Feature: Assigning role
Scenario: Assigning the role to User
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Ellipsis and click on view assigned roles
And :Add role to user
And :Click on Ok button in Allert