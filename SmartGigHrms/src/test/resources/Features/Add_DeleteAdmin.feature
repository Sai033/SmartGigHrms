Feature: Admin
Scenario: Adding user as Admin
Given :Open Url "https://ies-hrms.azurewebsites.net"
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Administration
And :Click on Add Admin
And :Search User
And :Check the radio button and click on Save button
And :Click on Ok button in Allert
#Then :Check user is added as Admin
And :Logout

Scenario: Deleting User as Admin
When :Enter valid User Name "Admin"
And :Enter valid Password "Demo@1234"
And :Click on Submit button
And :Navigate to Admin module
And :Click on Administration
And :Delete the user as Admin
And :Click on Ok button in Allert