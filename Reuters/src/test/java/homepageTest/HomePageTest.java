package homepageTest;

import Homepage.homepage;
import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI2 {
    homepage hometest;

    @BeforeMethod
    public void init() {
        hometest = PageFactory.initElements(appiumDriver, homepage.class);
    }

    @Test(priority = 1)
    public void ClickWelcome() {
        hometest.WelcomePage();
    }

    @Test(priority = 2)
    public void video1Test() {
        hometest.Video1();
    }

    @Test(priority = 3)
    public void opentabtest(){
        hometest.setOpentab();
    }

    @Test(priority = 4)
    public void clickthewire(){
        hometest.setThewire();
    }

    @Test(priority = 5)
    public void clickNow(){
        hometest.setNowbutton();
    }

    @Test(priority = 6)
    public void clickNightTest(){
        hometest.clickNightMode();
    }

    @Test(priority = 7)
    public void enableNightTest() throws InterruptedException {
        hometest.clickNightMode();
        sleep(3);
        hometest.enableNightMode();
    }



}
