Feature: user reset password

Scenario: Check whether User password is resetting
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Ellipsis and click on Reset password
And :Click on Ok button in Allert
And :Click on Ok button in Allert
And :Logout
When :Enter valid User Name "b.balu"
And :Enter valid Password "demo"
And :Click on Submit button
Then :Check Dashboard screen should display