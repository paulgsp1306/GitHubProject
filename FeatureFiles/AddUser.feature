Feature:
Add User Functionality
Scenario Outline:
Validate add user with multiple data
Given user navigate to orangehrm
When user logs in using username "Admin" and password as"Qedge123!@#"
When user click login button
When user click admin
When user click add 
When user select role"<UserRole>"
When user enter ename "<EmployeeName>"
When user enter username"<Username>"
When user enter password "<password>"
When user enter cpassword"<Cpassword>"
When user clicks on save
Then user validate Url
Then user close browser
Examples:
|UserRole|EmployeeName|Username|password|Cpassword|
|ESS|Altamash demo|Akhilesh9|Testing@#12345678|Testing@#12345678|
|Admin|Altamash demo|Akhilesh8|Testing@#12345678|Testing@#12345678|
|ESS|Altamash demo|Akhilesh5|Testing@#12345678|Testing@#12345678|
|Admin|Altamash demo|Akhilesh3|Testing@#12345678|Testing@#12345678|
|ESS|Altamash demo|Akhilesh6|Testing@#12345678|Testing@#12345678|