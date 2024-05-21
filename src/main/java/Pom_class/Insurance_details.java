package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_details {

    public static WebDriver driver;
    public Insurance_details (WebDriver driver2){
        driver=driver2;
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="autocomplete")
       private WebElement address;

    @FindBy (xpath = "(//span[@title='Select'])[1]")
    private WebElement type;

    @FindBy (xpath = "(//span[@title=\"Select\"])[1]")
    private WebElement insurance;

    @FindBy (id = "subscriberName")
    private WebElement name;

    @FindBy (xpath = "(//span[text()='Select'])[1]")
    private WebElement relationship;

    @FindBy (xpath = "//input[@placeholder=\"MM/DD/YYYY\"]")
    private WebElement dateofbirth;

    @FindBy (xpath = "(//span[@class=\"ant-select-selection-item\"])[4]")
    private WebElement gender;

    @FindBy (xpath = "(//button[@class=\"ant-btn css-1s9lor9 ant-btn-default\"])[1]")
    private WebElement frontimage;

    @FindBy (xpath = "(//button[@class=\"ant-btn css-1s9lor9 ant-btn-default\"])[2]")
    private WebElement backimage;

    public WebElement getFrontimage() {
        return frontimage;
    }

    public WebElement getBackimage() {
        return backimage;
    }

    public WebElement getTerms() {
        return terms;
    }

    public WebElement getSubmit() {
        return submit;
    }

    @FindBy (id="termsAgreement")
    private WebElement terms;

    @FindBy (id = "nextButton")
    private WebElement submit;

    public WebElement getAddress() {
        return address;
    }

    public WebElement getType() {
        return type;
    }

    public WebElement getInsurance() {
        return insurance;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getRelationship() {
        return relationship;
    }

    public WebElement getDateofbirth() {
        return dateofbirth;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getPlno() {
        return plno;
    }

    public WebElement getGplno() {
        return gplno;
    }

    @FindBy (xpath = "//input[@placeholder=\"Enter policy number\"]")
    private WebElement plno;

    @FindBy (xpath = "//input[@placeholder=\"Enter group policy number\"]")
    private WebElement gplno;


}
