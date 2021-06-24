package StepDefinitions;

import PageObjects.NHSHelpChkPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Util.CommonUtils;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class NHSHelpChkStepDefnitions extends CommonUtils {
    JavascriptExecutor js = (JavascriptExecutor)driver;
     NHSHelpChkPage nhsHelpChkPage = new NHSHelpChkPage(driver);

    public void bkBtnVisible()
    {
        Assert.assertTrue(nhsHelpChkPage.back.isDisplayed());
    }


    @Given("^I am on Home Page$")
    public void i_am_on_Home_Page() throws Throwable {
        String url = readPropertyFile("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[@id='logo']"));
        Assert.assertTrue(element.isDisplayed());
        driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']")).click();
    }



    @When("^I click on the start button$")
    public void i_click_on_the_start_button() throws Throwable {

        nhsHelpChkPage.clickStart();
    }

    @Then("^I am navigated to the choose my country Page$")
    public void i_am_navigated_to_the_choose_my_country_Page() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();

    }

    @When("^I choose the country of my choice$")
    public void i_choose_the_country_of_my_choice() throws Throwable {
        nhsHelpChkPage.selectCountry();
    }

    @Then("^I click the next button$")
    public void i_click_the_next_button() throws Throwable {
    nhsHelpChkPage.clickNext();
    }

    @Then("^I am navigated to enter by DOB details$")
    public void i_am_navigated_to_enter_by_DOB_details() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I enter the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_enter_the(String Day, String Month, String Year) throws Throwable {

        nhsHelpChkPage.date.sendKeys(Day);
        nhsHelpChkPage.month.sendKeys(Month);
        nhsHelpChkPage.year.sendKeys(Year);
    }

    @Then("^I click on next button$")
    public void i_click_on_next_button() throws Throwable {
         nhsHelpChkPage.clickNext();
         waitForTime(5);
    }

    @Then("^I should be navigated to the full time education Page$")
    public void i_should_be_navigated_to_the_full_time_education_Page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/full-time-education";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes to full time education$")
    public void i_click_yes_to_full_time_education() throws Throwable {
        nhsHelpChkPage.InEdu();
    }

    @Then("^I should be able to view the appropriate results page$")
    public void i_should_be_able_to_view_the_appropriate_results_page() throws Throwable {
        waitForTime(3);
        if(nhsHelpChkPage.result1.isDisplayed())
        {
            System.out.println("NHS will provide free health care " );
        }
        else if (nhsHelpChkPage.result2.isDisplayed())
        {
            System.out.println( "You get help with NHS costs " );
        }
    }

    @When("^I click no to full time education$")
    public void i_click_no_to_full_time_education() throws Throwable {
       nhsHelpChkPage.outOfEdu();
    }

    @Then("^I should be navigated to the civil partnership page$")
    public void i_should_be_navigated_to_the_civil_partnership_page() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for- Do you live with a partner\\?$")
    public void i_click_yes_for_Do_you_live_with_a_partner() throws Throwable
    {
nhsHelpChkPage.liveWthPartner();
    }

    @Then("^I should be navigated to the tax benefits page$")
    public void i_should_be_navigated_to_the_tax_benefits_page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click no for -Do you or your partner claim any benefits or tax credits\\?$")
    public void i_click_no_for_Do_you_or_your_partner_claim_any_benefits_or_tax_credits() throws Throwable {
    nhsHelpChkPage.wthOutBenefits();
    }

    @Then("^I should be navigated to health chk page- pregnant$")
    public void i_should_be_navigated_to_health_chk_page_pregnant() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/pregnant-or-given-birth";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for - Are you pregnant or have you given birth in the last (\\d+) months\\?$")
    public void i_click_yes_for_Are_you_pregnant_or_have_you_given_birth_in_the_last_months(int arg1) throws Throwable {
nhsHelpChkPage.yesPregnant();
    }

    @Then("^I should be navigated to health chk page- Injury or Illness$")
    public void i_should_be_navigated_to_health_chk_page_Injury_or_Illness() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/war-pensioner";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for - Do you have an injury or illness caused by serving in the armed forces\\?$")
    public void i_click_yes_for_Do_you_have_an_injury_or_illness_caused_by_serving_in_the_armed_forces() throws Throwable {
    nhsHelpChkPage.hadInjury();
    }

    @Then("^I should be navigated to health chk page- diabetes$")
    public void i_should_be_navigated_to_health_chk_page_diabetes() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/diabetes";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for-Do you have diabetes\\?$")
    public void i_click_yes_for_Do_you_have_diabetes() throws Throwable {
    nhsHelpChkPage.yesDiabetic();
    }

    @Then("^I should be navigated to health chk page- glaucoma$")
    public void i_should_be_navigated_to_health_chk_page_glaucoma() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/glaucoma";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for - Do you have glaucoma\\?$")
    public void i_click_yes_for_Do_you_have_glaucoma() throws Throwable {
nhsHelpChkPage.yesGlaucoma();
    }

    @Then("^I should be navigated to home checkup$")
    public void i_should_be_navigated_to_home_checkup() throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/care-home";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click no for - Do you or your partner live permanently in a care home\\?$")
    public void i_click_no_for_Do_you_or_your_partner_live_permanently_in_a_care_home() throws Throwable {
nhsHelpChkPage.noCareHome();
    }

    @Then("^I should be navigated to check income more than £(\\d+)$")
    public void i_should_be_navigated_to_check_income_more_than_£(int arg1) throws Throwable {
        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/savings";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click no for - Do you and your partner have more than sixteen thousand\\?$")
    public void i_click_no_for_Do_you_and_your_partner_have_more_than_sixteen_thousand() throws Throwable
    {
    nhsHelpChkPage.lessThan16000();
    }

    @When("^I click no for- Do you live with a partner\\?$")
    public void i_click_no_for_Do_you_live_with_a_partner() throws Throwable {
       nhsHelpChkPage.liveWthoutPartner();
    }

    @When("^I click yes for - Do you and your partner have more than sixteen thousand\\?$")
    public void i_click_yes_for_Do_you_and_your_partner_have_more_than_sixteen_thousand() throws Throwable {
         nhsHelpChkPage.moreThan16000();
    }

    @When("^I click yes for -Do you or your partner claim any benefits or tax credits\\?$")
    public void i_click_yes_for_Do_you_or_your_partner_claim_any_benefits_or_tax_credits() throws Throwable
    {
    nhsHelpChkPage.yesBenefits();
    }

    @Then("^I should be navigated to the Universal Credit page$")
    public void i_should_be_navigated_to_the_Universal_Credit_page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/paid-universal-credit";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for - Do you or your partner get paid Universal Credit\\?$")
    public void i_click_yes_for_Do_you_or_your_partner_get_paid_Universal_Credit() throws Throwable {
       waitForElement(nhsHelpChkPage.yesUniversal,3);
        nhsHelpChkPage.yesUniCredit();
    }
    @When("^I click yes for - Do you get paid Universal Credit\\?$")
    public void i_click_yes_for_Do_you_get_paid_Universal_Credit() throws Throwable {
        waitForElement(nhsHelpChkPage.yesUniversal,3);
        nhsHelpChkPage.yesUniCredit();
    }
    @Then("^I should be navigated to the Parent's Universal Credit page$")
    public void i_should_be_navigated_to_the_Parent_s_Universal_Credit_page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-claim";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();}

    @When("^I click yes for -As part of your or your parent's Universal Credit, do you have any of these\\?$")
    public void i_click_yes_for_As_part_of_your_or_your_parent_s_Universal_Credit_do_you_have_any_of_these() throws Throwable {
    nhsHelpChkPage.yesLCW();
    }

    @Then("^I should be navigated to the take home for the last Universal Credit period £(\\d+) page$")
    public void i_should_be_navigated_to_the_take_home_for_the_last_Universal_Credit_period_£_page(int arg1) throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click on yes for - Was the take-home pay used in the last Universal Credit period £(\\d+) or less\\?$")
    public void i_click_on_yes_for_Was_the_take_home_pay_used_in_the_last_Universal_Credit_period_£_or_less(int arg1) throws Throwable {
    nhsHelpChkPage.yes935();
    }


    @When("^I click yes for -Do you claim any benefits or tax credits\\?$")
    public void i_click_yes_for_Do_you_claim_any_benefits_or_tax_credits() throws Throwable {
        nhsHelpChkPage.yesBenefits();
    }

    @When("^I click applied for - Do you get paid Universal Credit\\?$")
    public void i_click_applied_for_Do_you_get_paid_Universal_Credit() throws Throwable {
        waitForElement(nhsHelpChkPage.applyForCredit,5);
       nhsHelpChkPage.appliedForCrd();
    }

    @Then("^I should be navigated to waiting on your Universal Credit decision page$")
    public void i_should_be_navigated_to_waiting_on_your_Universal_Credit_decision_page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/awaiting-universal-credit";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @Then("^I should be navigated to Do you get any of these benefits\\? page$")
    public void i_should_be_navigated_to_Do_you_get_any_of_these_benefits_page() throws Throwable {

        String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/benefits";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I choose TaxCredits$")
    public void i_choose_TaxCredits() throws Throwable {
        Thread.sleep(3000);
        nhsHelpChkPage.taxCredit();
    }

    @Then("^I click next button$")
    public void i_click_next_button() throws Throwable {
    nhsHelpChkPage.clickNext();
    }

    @When("^I should be navigated to type of tax credits page$")
    public void i_should_be_navigated_to_type_of_tax_credits_page() throws Throwable {

    String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/tax-credit-type";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I choose Working Tax Credit and Child Tax Credit together$")
    public void i_choose_Working_Tax_Credit_and_Child_Tax_Credit_together() throws Throwable {
nhsHelpChkPage.wrkandchildTaxCrd();
    }

    @When("^I should be navigated household income page$")
    public void i_should_be_navigated_household_income_page() throws Throwable {

         String expected = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/tax-credit-income";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        bkBtnVisible();
    }

    @When("^I click yes for Is your household income £(\\d+),(\\d+) or less\\?$")
    public void i_click_yes_for_Is_your_household_income_£_or_less(int arg1, int arg2) throws Throwable {
     nhsHelpChkPage.yes15276();
    }

}
