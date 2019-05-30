@Login
Feature: User should not able to login with invalid credential
  So user should see error message

  Background:
    Given user is on Home page

  Scenario Outline: User should notable login with invalid credential

    When  user navigate to login Page
    And user enter invalid "<username>" and "<password>"
    Then user should not be logged in Successfully and user see "<Error Message>"

    Examples:

      | username            | password | Error Message                                                                                           |
      | Sam13458@yahoo.com  | mypass1  | Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect |
      | Sam12345@yahoo.com  |          | Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect |
      | Jakeabcd @yahoo.com | mypass   | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      | Sampurmn @yahoo.com | mypass1  | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      | hary12345@yahoo.com |          | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      |                     | mypass   | Please enter your email                                                                                 |
      |                     | mypass1  | Please enter your email                                                                                      |
      |                     |          | Please enter your email                                                                                 |
