package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by cts1 on 13/12/16.
 */
public class PassengerDetails{
    //PASSENGER DETAILS ELEMENTS
    private By adulttitle1 = By.xpath("//select[@id='adultchoose1']");
    private By adulttitle2 = By.xpath("//select[@id='adultchoose2']");
    private By adultFirstName1 = By.xpath("//input[@id='adultfirstname1']");
    private By adultLastName1 = By.xpath("//input[@id='adultlastname1']");
    private By adultFirstName2 = By.xpath("//input[@id='adultfirstname2']");
    private By adultLastName2 = By.xpath("//input[@id='adultlastname2']");
    private By childTitle1 = By.xpath("//select[@id='childchoose1']");
    private By childFirstName1 = By.xpath("//input[@id='childfirstname1']");
    private By childLastName1 = By.xpath("//input[@id='childlastname1']");
    private By childdobDay = By.xpath("//select[@id='childdob_day1']");
    private By childdobMonth = By.xpath("//select[@id='childdob_month1']");
    private By childdobYear = By.xpath("//select[@id='childdob_year1']");
    private By makePayment = By.xpath("//input[@id='makePayment']");
    private By adult1Label = By.xpath("//div[@id='adult_cont_1']/div/label");
    private By childLabel = By.xpath("//div[@class='col-md-12 col-sm-12 col-xs-12 marginT10']/div/label");
    private By emailVerify = By.xpath("//input[@id='email']");
    private By phoneNumber = By.xpath("//input[@id='mobile']");
    private String strFirstName1;
    private String strLastName1;
    private String strFirstName2;
    private String strLastName2;
    private String strChildName;
    private String strChildLastName;

    public String getStrChildLastName() {
        return strChildLastName;
    }

    public void setStrChildLastName(String strChildLastName) {
        this.strChildLastName = strChildLastName;
    }

    public String getStrChildName() {
        return strChildName;
    }

    public void setStrChildName(String strChildName) {
        this.strChildName = strChildName;
    }

    public String getStrLastName2() {
        return strLastName2;
    }

    public void setStrLastName2(String strLastName2) {
        this.strLastName2 = strLastName2;
    }

    public String getStrFirstName2() {
        return strFirstName2;
    }

    public void setStrFirstName2(String strFirstName2) {
        this.strFirstName2 = strFirstName2;
    }

    public String getStrLastName1() {
        return strLastName1;
    }

    public void setStrLastName1(String strLastName1) {
        this.strLastName1 = strLastName1;
    }

    public String getStrFirstName1() {
        return strFirstName1;
    }

    public void setStrFirstName1(String strFirstName1) {
        this.strFirstName1 = strFirstName1;
    }

    public WebDriver driver;
    private WebDriverWait wait;

    public PassengerDetails(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver,5);
    }

    //SELECT ADULT TITLE FOR FIRST ADULT
    public void setAdultTitle1(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(adulttitle1).click();
        Select adult1 = new Select(driver.findElement(adulttitle1));
        adult1.selectByValue("1");
    }

    //SELECT ADULT TITLE FOR SECOND ADULT
    public void setAdultTitle2(){
        Select adult2 = new Select(driver.findElement(adulttitle2));
        adult2.selectByValue("1");
    }

    //SEND VALE TO FIRST NAME OF ADULT 1
    public void setFirstname1(){
        setStrFirstName1("Abhinav");
        wait.until(ExpectedConditions.visibilityOfElementLocated(adultFirstName1));
        driver.findElement(adultFirstName1).sendKeys(getStrFirstName1());
    }

    //SEND VALUE TO LAST NAME OF ADULT 1
    public void setLastName1(){
        setStrLastName1("Sharma");
        driver.findElement(adultLastName1).sendKeys(getStrLastName1());
    }

    //SEND VALUE TO FIRST NAME OF ADULT 2
    public void setFirstName2(){
        setStrFirstName2("Sachin");
        driver.findElement(adultFirstName2).sendKeys(getStrFirstName2());
    }

    //SEND VALUE TO LAST NAME OF ADULT 2
    public void setLastName2(){
        setStrLastName2("Tendulkar");
        driver.findElement(adultLastName2).sendKeys(getStrLastName2());
    }

    //SELECT TITLE FOR CHILD
    public void setChildTitle(){
        driver.findElement(childTitle1).click();
        Select child1 = new Select(driver.findElement(childTitle1));
        child1.selectByValue("4");
    }

    //SEND VALUE TO FIRST NAME OF CHILD
    public void setChildFirstName(){
        setStrChildName("Virat");
        driver.findElement(childFirstName1).sendKeys(getStrChildName());
    }

    //SELECT VALUE TO LAST NAME OF CHILD
    public void setChildLastName(){
        setStrChildLastName("Kohli");
        driver.findElement(childLastName1).sendKeys(getStrChildLastName());
    }

    //SELECT DAY OF DATE OF BIRTH OF CHILD
    public void setChildDOBDay(){
        driver.findElement(childdobDay).click();
        Select childday = new Select(driver.findElement(childdobDay));
        childday.selectByValue("12");
    }

    //SELECT MONTH OF DATE OF BIRTH OF CHILD
    public void setChildDOBMonth(){
        driver.findElement(childdobMonth).click();
        Select childmonth = new Select(driver.findElement(childdobMonth));
        childmonth.selectByValue("08");
    }

    //SELECT YEAR OF DATE OF BIRTH OF CHILD
    public void setChildDOBYear(){
        driver.findElement(childdobYear).click();
        Select childyear = new Select(driver.findElement(childdobYear));
        childyear.selectByValue("2014");
    }

    //CLICK ON MAKE PAYMENT
    public void clickMakePaymentButton(){
        driver.findElement(makePayment).click();
    }

    //VERIFY TITLE OF ADULT
    public String adult1TitleVerify(){
        return driver.findElement(adult1Label).getText();
    }

    //VERIFY TITLE OF CHILD
    public String childLabelVerify(){
        return driver.findElement(childLabel).getText();
    }

    //CHECK WHETHER MAKE PAYMENT BUTTON IS ENABLED
    public String makePaymentButtonVerify(){
        Boolean f = driver.findElement(makePayment).isEnabled();
        String b = f.toString();
        return b;
    }

    //GET TEXT OF MAKE PAYMENT TITLE
    public String makePaymentButtonText(){
        return driver.findElement(makePayment).getAttribute("value");
    }

    //CHECK WHETHER EMAIL IS SAME AS USED FOR LOG IN
    public String emailVerify(){
        return driver.findElement(emailVerify).getAttribute("value");
    }

    //CHECK WHETHER PHONE NUMBER IS SAME AS USED FOR LOG IN
    public String phoneNumberVerify(){
        return driver.findElement(phoneNumber).getAttribute("value");
    }

    //SET PASSENGER DETAILS
    public void setPassengerDetails(){

        this.setAdultTitle1();
        this.setAdultTitle2();
        this.setFirstname1();
        this.setLastName1();
        this.setFirstName2();
        this.setLastName2();
        this.setChildTitle();
        this.setChildFirstName();
        this.setChildLastName();
        this.setChildDOBDay();
        this.setChildDOBMonth();
        this.setChildDOBYear();
        this.clickMakePaymentButton();
    }
}