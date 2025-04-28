package Lesson_24;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class DownloadFile extends BasePage {

    @FindBy(css = "a.btn-white[href=\"/panel/instructions\"]")
    private WebElement instructionsButton;

    @FindBy(css = "a.instruction-link_download[href=\"https://qauto.forstudy.space/public/instructions/audi/tt/Front windshield wipers on Audi TT.pdf\"]")
    private WebElement audiDownloadButton;

    @FindBy(css = "button.-guest")
    private WebElement guestLogInButton;

    @FindBy(css = "#brandSelectDropdown")
    private WebElement carSelect;

    @FindBy(css = "ul.brand-select-dropdown_menu")
    private WebElement divWithCarSelect;

    public DownloadFile(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void downloadFrontWindshieldWipers() {
        actions.click(guestLogInButton).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(instructionsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(audiDownloadButton)).click();
        actions.click(audiDownloadButton).build().perform();
    }

    public void allCars() {
        actions.click(guestLogInButton).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(instructionsButton)).click();
        actions.click(carSelect).build().perform();
        File file = new File("C:\\Users\\irenc\\Documents\\Hillel\\src\\Test\\resources\\Downloads\\car_list.txt");

        try (FileWriter writer = new FileWriter(file)){

            for (WebElement element : divWithCarSelect.findElements(By.cssSelector("li.brand-select-dropdown_item"))) {
                writer.write(element.getText()+ System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
