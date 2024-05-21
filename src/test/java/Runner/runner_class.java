package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    @RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Cape-ElecTric\\IdeaProjects\\Lunajoy\\src\\test\\java\\Feature\\Lunajoy.feature", glue="Step_defen")
    public class runner_class {
        public static WebDriver driver;

        @BeforeClass
        public static void start() {
            driver = new ChromeDriver();
        }

//        @AfterClass
//        public static void end() {
//            driver.quit();
//        }
    }



