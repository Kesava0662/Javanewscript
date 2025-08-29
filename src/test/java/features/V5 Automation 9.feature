Feature: V5 Automation 91
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Signin_1
@uid1335530008
@set21
@test001
@Id6899d275159fe8ca5bb1f273
@Sanity
@Smoke
@SignIn
Scenario Outline: Verify Sign in and Logout functionality
i. login to Application 
ii.logout from Application 
Given I have access to application
Then verify displayed Login to algoQA in login page
When I entered Enter your email in login page as '<Enter your email>'
And I entered Enter your password in login page as '<Enter your password>'
And I copied text Enter your password in login page
Then verify displayed Show Password Eye button in login page
And verify content Enter your password in login page as '<Enter your password1>'
When I selected Login Button in login page
Then verify displayed User signed in successfully popup in login page
When I click if visible react tour skip button in algoqa
Then verify displayed AlgoQA Dashboard label in dashboard page
When I selected profile menu 3dots in left navigation bar
And I selected Logout in profile menu

Examples:
|SlNo.|Enter your email|Enter your password|Enter your password1|
|1|Enteryouremail|Enteryourpassword|Enteryourpassword_1|

#Total No. of Test Cases : 1

