@cucumberHooks
Feature: AdPortal UAT new user FAQ link functionlaity
@FAQLink
Scenario: New User lands on dashboard and selects the FAQ links


When  I log in using newly created User Email and Password
Then  I should land on the Ad Portal New Dashboard
Then  I should see the FAQ links 
Then  When I select the links the links should open the relevant FAQ page in a new browser tab