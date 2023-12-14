Feature: Activate/Deactivate user
Scenario: Check whether the User is able to Deactivate the activated user

Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Search user and Deactivate the User
And :Click on Ok button in Allert
And :Click on Ok button in Allert
Then :Check user is Deactivated


Scenario: Check whether the User is able to activate the Deactivated user

Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Search user and Activate the User
And :Click on Ok button in Allert
And :Click on Ok button in Allert
Then :Check user is Activated