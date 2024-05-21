package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sigin_page {

    public static WebDriver driver;
public sigin_page (WebDriver driver1){
this.driver=driver1;
    PageFactory.initElements(driver,this);
}

@FindBy (id = "firstName")
    private WebElement firstname;

@FindBy (id = "lastName")
    private WebElement lastname;

@FindBy(xpath = "//input[@placeholder=\"MM/DD/YYYY\"]")
    private WebElement DOB;

@FindBy(id = "mobileNumber")
    private WebElement mobno;




    @FindBy (xpath = "//input[@type=\"email\"]")
    private WebElement email;

@FindBy(xpath = "//button[text()=\"Next\"]")
    private WebElement next;

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getDOB() {
        return DOB;
    }

    public WebElement getMobno() {
        return mobno;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getNext() {
        return next;
    }
}
