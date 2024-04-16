@Login1 @sanity

Feature:
  To check the login functionality of facebook

  
@smoke  
  Scenario:

   To check with valid email and invalid password
  When  to pass valid email and invalid pass
 And  to check user in home page or invalide creditial page
  And to get page title and url
@regression @smoke
 Scenario:

  To check with valid email and without password
 When  to pass valid email and click the login button
 And to check user in home page or invalide creditial page
   And to get page title and url
 @regression @sanity
 Scenario:
To check with invalid email and valid password

 When  to pass invalid email and valid pass
 And  to check user in home page or invalide creditial page
   And to get page title and url