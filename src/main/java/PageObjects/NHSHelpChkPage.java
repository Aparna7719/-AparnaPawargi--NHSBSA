package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSHelpChkPage {
    public NHSHelpChkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='back']")
    public WebElement back;

    public void clickBack() {
        back.click();
    }

    @FindBy(xpath = "//div[@class='form-group']/input[@id='next-button']")
    private WebElement start;

    public void clickStart() {
        start.click();
    }

    @FindBy(xpath = "//label[@id='label-wales']")
    private WebElement countryWales;

    public void selectCountry()
    {
        countryWales.click();
    }

    //DOB
    @FindBy(xpath = "//input[@id='dob-day']")
    public WebElement date;

    @FindBy(xpath = "//input[@id='dob-month']")
    public WebElement month;

    @FindBy(xpath = "//input[@id='dob-year']")
    public WebElement year;
    //Next
    @FindBy(xpath = "//div[@class='form-group']/input[@id='next-button']")
    private WebElement next;

    public void clickNext() {
        next.click();
    }

    //Education
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    public WebElement inedu;
    public void InEdu() {
        inedu.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    public WebElement outofedu;
    public void outOfEdu() {
        outofedu.click();
    }

    //Results
    @FindBy(xpath = "//div[@class='done-panel']/h1[@class='heading-xlarge done-panel']")
    public WebElement result1;
    public void getResult1() {
        result1.getText();
    }

    @FindBy(xpath = "//h2[@id='FREE-heading']")
    public WebElement result2;
    public void getResult2() {
        result2.getText();
    }

    //Partner
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    private WebElement withPartner;
    public void liveWthPartner() {
        withPartner.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement withoutPartner;
    public void liveWthoutPartner() {
        withoutPartner.click();
    }

    //Tax Benefits and Credits
    @FindBy(xpath = "//label[@id='label-yes']")
    private WebElement onBenefits;
    public void getBenefits() {
        onBenefits.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement notBenefits;
    public void wthOutBenefits() {
        notBenefits.click();
    }

    //Pregnancy
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    private WebElement pregnant;
    public void yesPregnant() {
        pregnant.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement noPregnant;
    public void notPregnant() {
        noPregnant.click();
    }

    //Injury
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    private WebElement yesInjury;
    public void hadInjury() {
        yesInjury.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement noInjury;
    public void hadNoInjury() {
        noInjury.click();
    }

    //Diabetes
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    private WebElement diabetic;
    public void yesDiabetic() {
        diabetic.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement notDiabetes;
    public void NotDiabetic() {
        notDiabetes.click();
    }

    //Glaucoma
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    public WebElement ysglaucoma;

    public void yesGlaucoma()
    {
        ysglaucoma.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement nglaucoma;

    public void noGlaucoma() {
        nglaucoma.click();
    }

    //careHome
    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-yes']")
    private WebElement yCareHome;

    public void yesCareHome() {
        yCareHome.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement ncareHome;

    public void noCareHome() {
        ncareHome.click();
    }

    // income more than £16000
    @FindBy(xpath = "//label[@id='label-yes']")
    private WebElement moreIncome16000;

    public void moreThan16000() {
        moreIncome16000.click();
    }

    @FindBy(xpath = "//label[@id='label-yes']")
    private WebElement lessIncome16000;

    public void lessThan16000() {
        lessIncome16000.click();
    }

    //TaxBenefit
    @FindBy(xpath = "//label[@id='label-yes']")
    private WebElement ybenefit;

    public void yesBenefits() {
        ybenefit.click();
    }

    @FindBy(xpath = "//div[@class='inline-form-groups']/label[@id='label-no']")
    private WebElement nbenefit;

    public void noBenefits() {
        nbenefit.click();
    }
//UniversalCredit

    @FindBy(xpath = "//input[@id='yes-universal' and @type='radio']")
    public WebElement yesUniversal;
    public void yesUniCredit() {
        yesUniversal.click();
    }

    @FindBy(xpath = "//input[@id='not-yet' and @type='radio']")
    public WebElement applyForCredit;
    public void appliedForCrd() {
        applyForCredit.click();
    }

    @FindBy(xpath = "//input[@id='different-benefit' and @type='radio']")
    public WebElement diffBenefit;
    public void diffBenefit() {
        diffBenefit.click();
    }

    //types of Benefits
    @FindBy(xpath = "//body[1]/main[1]/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")
    public WebElement ytaxCredit;
    public void taxCredit() {
        ytaxCredit.click();
    }

    @FindBy(xpath = "//input[@id='incSupport']")
    public WebElement incSupport;
    public void onIncSupport() {
        incSupport.click();
    }

    @FindBy(xpath = "//input[@id='esa']")
    public WebElement esa;
    public void onEsa() {
        esa.click();
    }

    @FindBy(xpath = "//input[@id='jsa']")
    public WebElement jsa;
    public void onJsa() {
        jsa.click();
    }

    @FindBy(xpath = "//input[@id='penCredit']")
    public WebElement penCredit;
    public void onPenCredit() {
        penCredit.click();
    }

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement diffCredit;
    public void onDiffCredit() {
        diffCredit.click();
    }

    //LCW
    @FindBy(xpath = "//label[@id='label-yes']")
    public WebElement yLCW;
    public void yesLCW() {
        yLCW.click();
    }

    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nLCW;
    public void noLCW() {
        nLCW.click();
    }

    //
    @FindBy(xpath = "//label[@id='label-yes']")
    public WebElement y935;
    public void yes935() {
        y935.click();
    }

    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement n935;
    public void no935() {
        n935.click();
    }

//type of taxCredits
    @FindBy(xpath = "//input[@id='workingChildTaxCredit']")
    public WebElement wtcandctc;
    public void wrkandchildTaxCrd()
    {
        wtcandctc.click();
    }

    @FindBy(xpath = "//input[@id='workingDisabilityTaxCredit']")
    public WebElement wkgdisablTaxCrd;
    public void wrkdisabilityTaxCrd()
    {
        wkgdisablTaxCrd.click();
    }

    @FindBy(xpath = "//input[@id='childTaxCredit']")
    public WebElement chldTaxCrd;
    public void childTaxCrd()
    {
        chldTaxCrd.click();
    }

    @FindBy(xpath = "//input[@id='workingTaxCredit']")
    public WebElement wkgTaxCrd;
    public void wrkTaxCrd()
    {
        wkgTaxCrd.click();
    }

    //income  £15,276
    @FindBy(xpath = "//label[@id='label-yes']")
    public WebElement y15276;
    public void yes15276() {
        y15276.click();
    }

    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement n15276;
    public void no15276() {
        n15276.click();
    }
}