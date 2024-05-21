package Step_defen;

import Base.base_class;
import Pom_class.Insurance_details;
import Pom_class.sigin_page;
import Runner.runner_class;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static Base.base_class.Launchurl;

public class Lunajoy_signin extends base_class {
    WebDriver driver = runner_class.driver;
sigin_page si = new sigin_page(driver);

Insurance_details id =new Insurance_details (driver);




    @Given("user launch the Lunajoy website")
    public void user_launch_the_lunajoy_website() {
        Launchurl(driver, "https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");
        maxview(driver);

    }
    @Given("enter a valid Firstname & Lastname")
    public void enter_a_valid_firstname_lastname() throws InterruptedException {
        slep(driver);
        sendkey(si.getFirstname(),"aravind");
        sendkey(si.getLastname(),"prakash");

    }
    @And("enter a valid DOB, mobile no. & email")
    public void enterAValidDOBMobileNoEmail() {
        sendkey(si.getDOB(),"03/03/1990");
     sendkey(si.getEmail(), "aravindp3395@gmail.com");
     sendkey(si.getMobno(), "765 252-7577");
    }
    @Given("click the ecter button")
    public void click_the_ecter_button() throws InterruptedException {

        click(si.getNext());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @And("user enter the address")
    public void userEnterTheAddress() throws InterruptedException, AWTException {
        slep(driver);
        sendkey(id.getAddress(), "232 Forsyth St SW, Atlanta, GA 30303, USA");
        slep(driver);
        down(driver);
        enterkey(driver);


    }

    @And("user enter the treatment and insurance details")
    public void userEnterTheTreatmentAndInsuranceDetails() throws InterruptedException, AWTException {
        slep(driver);
        click(id.getType());
        down(driver);
        up(driver);
        enterkey(driver);
        slep(driver);
        click(id.getInsurance());
        Thread.sleep(Duration.ofMillis(3000));
        down(driver);
        enterkey(driver);
    }

    @And("user enter personal details")
    public void userEnterPersonalDetails() throws InterruptedException, AWTException {
        slep(driver);
        sendkey(id.getName(),"aravind prakash");
        slep(driver);
        click(id.getRelationship());
        enterkey(driver);
        slep(driver);
        sendkey(id.getDateofbirth(), "03/03/1990");
        enterkey(driver);
        tab(driver);
        slep(driver);
        click(id.getGender());
        down(driver);
        enterkey(driver);
        slep(driver);
        sendkey(id.getPlno(),"78474876");
        slep(driver);
        sendkey(id.getGplno(),"g767584");

    }

    @And("user upload insurance card image")
    public void userUploadInsuranceCardImage() throws InterruptedException, AWTException {
        click(id.getFrontimage());
        slep(driver);
        StringSelection st= new StringSelection("Downloads");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st,null);
        copy_paste(driver);
        enterkey(driver);
        slep(driver);
        StringSelection st1= new StringSelection("25 (1) (1)");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st1,null);
        copy_paste(driver);
        enterkey(driver);
        click(id.getBackimage());
        slep(driver);
//        StringSelection st= new StringSelection("");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st,null);
//        copy_paste(driver);
//        enterkey(driver);
//        slep(driver);
//        StringSelection st3= new StringSelection("");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st3,null);
//        copy_paste(driver);
//        enterkey(driver);
        slep(driver);
        click(id.getTerms());
        slep(driver);
        click(id.getSubmit());
    }
}
