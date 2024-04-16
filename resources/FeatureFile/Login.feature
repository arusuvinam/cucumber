
@Login @smoke

Feature:
  To check the login functionality of facebook
  Scenario Outline:
 To check with different credentials

 
 When  to pass"<username>"  and " <pass>"
 And  to check user in home page or invalide creditial page
  And to get page title and url
 
 
 
Examples:
 |username|pass|
 |arusuvinam|123|
 |vijjj|34567|
 
 
 
 













