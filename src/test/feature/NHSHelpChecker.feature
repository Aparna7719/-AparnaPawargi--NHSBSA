Feature:Validate NHS support for Person living in Wales

  As a user I should be able to check whether there is support for full time education students

  @under18 @test
  Scenario Outline:
    Given I am on Home Page
    When I click on the start button
    Then I am navigated to the choose my country Page
    When I choose the country of my choice
    Then I click the next button
    Then I am navigated to enter by DOB details
    When I enter the "<Day>", "<Month>", "<Year>"
    Then I click on next button
    Then I should be navigated to the full time education Page
    When I click yes to full time education
    Then I click the next button
    Then I should be able to view the appropriate results page
    Examples:
    |Day|Month|Year|
    |02 |02  |2003 |


@under18withpartnernobenefits @test
Scenario Outline:
  Given I am on Home Page
  When I click on the start button
  Then I am navigated to the choose my country Page
  When I choose the country of my choice
  Then I click the next button
  Then I am navigated to enter by DOB details
  When I enter the "<Day>", "<Month>", "<Year>"
  Then I click on next button
  Then I should be navigated to the full time education Page
  When I click no to full time education
  Then I click on next button
  Then I should be navigated to the civil partnership page
  When I click yes for- Do you live with a partner?
  Then I click on next button
  Then I should be navigated to the tax benefits page
  When I click no for -Do you or your partner claim any benefits or tax credits?
  Then I click on next button
  Then I should be navigated to health chk page- pregnant
  When I click yes for - Are you pregnant or have you given birth in the last 12 months?
  Then I click on next button
  Then I should be navigated to health chk page- Injury or Illness
  When I click yes for - Do you have an injury or illness caused by serving in the armed forces?
  Then I click on next button
  Then I should be navigated to health chk page- diabetes
  When I click yes for-Do you have diabetes?
  Then I click on next button
  Then I should be navigated to health chk page- glaucoma
  When I click yes for - Do you have glaucoma?
  Then I click on next button
  Then I should be navigated to home checkup
  When I click no for - Do you or your partner live permanently in a care home?
  Then I click on next button
  Then I should be navigated to check income more than £16000
  When I click no for - Do you and your partner have more than sixteen thousand?
  Then I click on next button
  Then I should be able to view the appropriate results page
  Examples:
    |Day|Month|Year|
    |02 |02  |2003 |


  @under18withoutpartnernobenefits @test
  Scenario Outline:
  Given I am on Home Page
  When I click on the start button
  Then I am navigated to the choose my country Page
  When I choose the country of my choice
  Then I click the next button
  Then I am navigated to enter by DOB details
  When I enter the "<Day>", "<Month>", "<Year>"
  Then I click on next button
  Then I should be navigated to the full time education Page
  When I click no to full time education
  Then I click on next button
  Then I should be navigated to the civil partnership page
  When I click no for- Do you live with a partner?
  Then I click on next button
  Then I should be navigated to the tax benefits page
  When I click no for -Do you claim any benefits or tax credits?
  Then I click on next button
  Then I should be navigated to health chk page- pregnant
  When I click yes for - Are you pregnant or have you given birth in the last 12 months?
  Then I click on next button
  Then I should be navigated to health chk page- Injury or Illness
  When I click yes for - Do you have an injury or illness caused by serving in the armed forces?
  Then I click on next button
  Then I should be navigated to health chk page- diabetes
  When I click yes for-Do you have diabetes?
  Then I click on next button
  Then I should be navigated to health chk page- glaucoma
  When I click yes for - Do you have glaucoma?
  Then I click on next button
  Then I should be navigated to home checkup
  When I click no for - Do you or your partner live permanently in a care home?
  Then I click on next button
  Then I should be navigated to check income more than £16000
  When I click yes for - Do you and your partner have more than sixteen thousand?
  Then I click on next button
  Then I should be able to view the appropriate results page
    Examples:
    |Day|Month|Year|
    |02 |02  |2003 |


    @18withpartnerwithbenefits @test
    Scenario Outline:
    Given I am on Home Page
    When I click on the start button
    Then I am navigated to the choose my country Page
    When I choose the country of my choice
    Then I click the next button
    Then I am navigated to enter by DOB details
    When I enter the "<Day>", "<Month>", "<Year>"
    Then I click on next button
    Then I should be navigated to the full time education Page
    When I click no to full time education
    Then I click on next button
    Then I should be navigated to the civil partnership page
    When I click yes for- Do you live with a partner?
    Then I click on next button
    Then I should be navigated to the tax benefits page
    When I click yes for -Do you or your partner claim any benefits or tax credits?
    Then I click on next button
    Then I should be navigated to the Universal Credit page
    When I click yes for - Do you or your partner get paid Universal Credit?
    Then I click on next button
    Then I should be navigated to the Parent's Universal Credit page
    When I click yes for -As part of your or your parent's Universal Credit, do you have any of these?
    Then I click on next button
    Then I should be navigated to the take home for the last Universal Credit period £935 page
    When I click on yes for - Was the take-home pay used in the last Universal Credit period £935 or less?
      Then I click on next button
      Then I should be able to view the appropriate results page
      Examples:
        |Day|Month|Year|
        |02 |02  |2003 |

      @under18withoutpartnernwithbenefits @test
      Scenario Outline:
        Given I am on Home Page
        When I click on the start button
        Then I am navigated to the choose my country Page
        When I choose the country of my choice
        Then I click the next button
        Then I am navigated to enter by DOB details
        When I enter the "<Day>", "<Month>", "<Year>"
        Then I click on next button
        Then I should be navigated to the full time education Page
        When I click no to full time education
        Then I click on next button
        Then I should be navigated to the civil partnership page
        When I click no for- Do you live with a partner?
        Then I click on next button
        Then I should be navigated to the tax benefits page
        When I click yes for -Do you claim any benefits or tax credits?
        Then I click on next button
        Then I should be navigated to the Universal Credit page
        When I click applied for - Do you get paid Universal Credit?
        Then I should be navigated to waiting on your Universal Credit decision page
        Then I click on next button
       Then I should be navigated to Do you get any of these benefits? page
        When I choose TaxCredits
        Then I click next button
        Then I should be navigated to type of tax credits page
        When I choose Working Tax Credit and Child Tax Credit together
        Then I click next button
        When I should be navigated household income page
        Then I should be navigated to the take home for the last Universal Credit period £935 page
        When I click on yes for - Was the take-home pay used in the last Universal Credit period £935 or less?
        Then I click on next button
        Then I should be able to view the appropriate results page
        Examples:
          |Day|Month|Year|
          |02 |02  |2003 |

        @adultwithpartnernobenefits  @test
        Scenario Outline:
          Given I am on Home Page
          When I click on the start button
          Then I am navigated to the choose my country Page
          When I choose the country of my choice
          Then I click the next button
          Then I am navigated to enter by DOB details
          When I enter the "<Day>", "<Month>", "<Year>"
          Then I click on next button
          Then I should be navigated to the civil partnership page
          When I click yes for- Do you live with a partner?
          Then I click on next button
          Then I should be navigated to the tax benefits page
          When I click no for -Do you or your partner claim any benefits or tax credits?
          Then I click on next button
          Then I should be navigated to health chk page- pregnant
          When I click yes for - Are you pregnant or have you given birth in the last 12 months?
          Then I click on next button
          Then I should be navigated to health chk page- Injury or Illness
          When I click yes for - Do you have an injury or illness caused by serving in the armed forces?
          Then I click on next button
          Then I should be navigated to health chk page- diabetes
          When I click yes for-Do you have diabetes?
          Then I click on next button
          Then I should be navigated to health chk page- glaucoma
          When I click yes for - Do you have glaucoma?
          Then I click on next button
          When I click no for - Do you or your partner live permanently in a care home?
          Then I click on next button
          Then I should be navigated to check income more than £16000
          When I click yes for - Do you and your partner have more than sixteen thousand?
          Then I click on next button
          Then I should be able to view the appropriate results page

          Examples:
            |Day|Month|Year|
            |02 |02  |2001 |

          @adultwithoutpartnernobenefits @test
          Scenario Outline:
          Given I am on Home Page
          When I click on the start button
          Then I am navigated to the choose my country Page
          When I choose the country of my choice
          Then I click the next button
          Then I am navigated to enter by DOB details
          When I enter the "<Day>", "<Month>", "<Year>"
          Then I click on next button
          Then I should be navigated to the civil partnership page
          When I click yes for- Do you live with a partner?
          Then I click on next button
          Then I should be navigated to the tax benefits page
          When I click no for -Do you or your partner claim any benefits or tax credits?
          Then I click on next button
          Then I should be navigated to health chk page- pregnant
          When I click yes for - Are you pregnant or have you given birth in the last 12 months?
          Then I click on next button
          Then I should be navigated to health chk page- Injury or Illness
          When I click yes for - Do you have an injury or illness caused by serving in the armed forces?
          Then I click on next button
          Then I should be navigated to health chk page- diabetes
          When I click yes for-Do you have diabetes?
          Then I click on next button
          Then I should be navigated to health chk page- glaucoma
          When I click yes for - Do you have glaucoma?
          Then I click on next button
          Then I should be navigated to home checkup
          When I click no for - Do you or your partner live permanently in a care home?
          Then I click on next button
          Then I should be navigated to check income more than £16000
          When I click no for - Do you and your partner have more than sixteen thousand?
          Then I click on next button
          Then I should be able to view the appropriate results page
          Examples:
            |Day|Month|Year|
            |02 |02  |2001 |

            @adultwithpartnerwithbenefits @test
            Scenario Outline:
            Given I am on Home Page
            When I click on the start button
            Then I am navigated to the choose my country Page
            When I choose the country of my choice
            Then I click the next button
            Then I am navigated to enter by DOB details
            When I enter the "<Day>", "<Month>", "<Year>"
            Then I click on next button
            Then I should be navigated to the civil partnership page
            When I click yes for- Do you live with a partner?
            Then I click on next button
            Then I should be navigated to the tax benefits page
            When I click yes for -Do you or your partner claim any benefits or tax credits?
            Then I click on next button
            Then I should be navigated to the Universal Credit page
            When I click yes for - Do you or your partner get paid Universal Credit?
            Then I click on next button
            Then I should be navigated to the Parent's Universal Credit page
            When I click yes for -As part of your or your parent's Universal Credit, do you have any of these?
            Then I click on next button
            Then I should be navigated to the take home for the last Universal Credit period £935 page
            When I click on yes for - Was the take-home pay used in the last Universal Credit period £935 or less?
            Then I click on next button
            Then I should be able to view the appropriate results page
Examples:
  |Day|Month|Year|
  |02 |02  |2001 |

              @withoutpartnerwithbenefits @test
              Scenario Outline:
              Given I am on Home Page
              When I click on the start button
              Then I am navigated to the choose my country Page
              When I choose the country of my choice
              Then I click the next button
              Then I am navigated to enter by DOB details
              When I enter the "<Day>", "<Month>", "<Year>"
              Then I click on next button
              Then I should be navigated to the civil partnership page
              When I click no for- Do you live with a partner?
              Then I click on next button
              Then I should be navigated to the tax benefits page
              When I click yes for -Do you claim any benefits or tax credits?
              Then I click on next button
              Then I should be navigated to the Universal Credit page
              When I click yes for - Do you get paid Universal Credit?
                            Then I click next button
              When I should be navigated household income page
                Then I should be navigated to the take home for the last Universal Credit period £935 page
                When I click on yes for - Was the take-home pay used in the last Universal Credit period £935 or less?
                Then I click on next button
                Then I should be able to view the appropriate results page

              Examples:
                |Day|Month|Year|
                |02 |02  |2001 |

