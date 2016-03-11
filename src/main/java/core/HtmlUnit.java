package core;

/**
 * Created by Serg on 3/11/16.
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {
    public HtmlUnit() {
    }

    public static void main(String[] args) {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        String text_case_id = "TC-002.01";
        String url = "http://www.facebook.com";
        String title_expected = "Facebook - Log In or Sign Up";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        String title_actual = driver.getTitle();
        if(title_expected.equals(title_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id);
            System.out.println("URL: \t\t\t" + url);
            System.out.println("Title Expected: \t" + title_expected);
            System.out.println("Title Actual: \t\t" + title_actual);
            System.out.println("Test Case Result: \tPASSED");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id);
            System.out.println("URL: \t\t\t" + url);
            System.out.println("Title Expected: \t" + title_expected);
            System.out.println("Title Actual: \t\t" + title_actual);
            System.out.println("Test Case Result: \tFAILED");
        }

        driver.quit();
    }
}