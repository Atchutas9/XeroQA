#Author: atchuta.s9@gmail.com
#Keywords Summary : login, xero, add bank account
#@login
Feature: Add bank account
  As a Xero User,
In order to manage my business successfully,
I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.
 # @successful_login
  Scenario Outline: Successful login
    Given I want to launch into the  <xeroUrl> in the browser
    Then I enter the <username> and  <password> on the login screen
    And I click on <btn> button to login
    Then I click on <link> on the verfication page
    Then I should land on the <dashboard> page
    Examples: 
      | xeroUrl                 | username             | password |	btn 	| link 		| dashboard |
      | https://login.xero.com/ | atchuta.s9@gmail.com | Test@123 | Login 	| Not now	| Dashboard |

 # @adding_bank_account
  Scenario Outline: adding bank account in xero organisation
   Then I click on <tab> and <subMenu> from the menu header
    And I click on "Add Bank Account" on Accounts page
    Then I select the <bankName> from the bank list
    Then I enter the <accountName> and select the <accountType>
    And I enter <bsbCode> and <accountNumber>
    Then I click on <button> to proceed further
    Then I see the account has been added successfully on bank accounts tab
     Examples:
    | tab 		| SubMenu 	   | bankName 						  | accountName   | accountType 		  | bsbCode | accountNumber | button 	|
    | Accounts 	| BankAccounts | ANZ (AU) 				          | test_ANZ	  | Everyday (day-to-day) | 111-111 | 11123456789	| Continue  |
    