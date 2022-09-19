package A101.test;

import A101.pages.BasePage;
import A101.utilities.ConfigurationReader;
import A101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstCase extends BasePage {
WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.elementToBeClickable(kabulEt));
        kabulEt.click();

        actions.click(giyim_aksesuar).perform();
        kadınİçGiyim.click();

        wait.until(ExpectedConditions.elementToBeClickable(dizaltıÇorap));
        dizaltıÇorap.click();

        Thread.sleep(3000);
        siyah.click();

        Thread.sleep(3000);
        siyah2.click();

        for (WebElement each : product) {

            System.out.println(each.getText());
            Assert.assertTrue(each.getText().toLowerCase().contains("siyah"));
        }


    }

}
