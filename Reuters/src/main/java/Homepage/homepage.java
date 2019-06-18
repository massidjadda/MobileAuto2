package Homepage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends MobileAPI2 {
    @FindBy(id = "android:id/content\n")
    WebElement Welcome;

    @FindBy(id = "android:id/content\n")
    WebElement firstvideo;

    @FindBy(id = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[11]/div")
    WebElement opentab;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[30]/div")
    WebElement thewire;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[34]/div")
    WebElement nowbutton;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[16]")
    WebElement nightmode;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[8]")
    WebElement enableNight;


    public void WelcomePage() {
        Welcome.click();
    }


    public void Video1() {
        firstvideo.click();
    }

    public void setOpentab(){opentab.click();}

    public void setThewire(){thewire.click();}

    public void setNowbutton(){nowbutton.click();}

    public void clickNightMode(){nightmode.click();
    }

    public void enableNightMode(){enableNight.isEnabled();}






}
