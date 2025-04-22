package Lesson_22;

import Base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.hero-video .hero-video_frame")
    private WebElement qautoFrame;

    public String getFrameTitleText() {
        driver.switchTo().frame(qautoFrame);


        YouTubeFrame youTubeFrame = new YouTubeFrame();

        String titleText = youTubeFrame.getTitleText();
        driver.switchTo().parentFrame();
        return titleText;


    }
    public YouTubeFrame getFrame() {
        driver.switchTo().frame(qautoFrame);
        return new YouTubeFrame();
    }

    public class YouTubeFrame {

        public String getTitleText() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return document.title;");
        }

        public FramePage returnToParentFrame() {
            driver.switchTo().parentFrame();
            return new FramePage(driver);
        }
    }
}
