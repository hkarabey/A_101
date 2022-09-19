package A101.pages;

import A101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[.='Kabul Et']")
    public WebElement kabulEt;

    @FindBy(xpath = "//section[@class='container-fluid p-0']//li[@data-pk='37a6c1c8-a180-4b87-9ec9-3a29f6453a0c']/a")
    public WebElement giyim_aksesuar;

    @FindBy(xpath = "//section[@class='page-list js-container']//div[@class='content']//ul//li[@class='derin '][2]/a[@title='Kadın İç Giyim']")
    public WebElement kadınİçGiyim;

    @FindBy(xpath = "//section[@class='page-list js-container']//div[@class='content']//ul//li[@class='derin '][2]/a[@title='Dizaltı Çorap']")
    public WebElement dizaltıÇorap;

    @FindBy(xpath = "//div[.='Renk']/..//label[.='SİYAH']")
    public WebElement siyah;

    @FindBy (xpath = "//div[.='Renk']/..//label[.='SİYAH 2']")
    public WebElement siyah2;

    @FindBy(xpath = "//section[@class='page-list js-container']//div[@class='col-md-10 col-sm-9']//ul[@class='product-list-general']//h3")
    public List<WebElement> product;


}
