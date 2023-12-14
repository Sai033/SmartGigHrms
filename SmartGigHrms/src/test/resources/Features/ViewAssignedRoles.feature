Feature: view Assigned roles

Scenario: Checking the no. of roles assigned

Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Ellipsis and click on view assigned roles
Then :Print the Role names