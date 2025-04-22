package Lesson_22;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SocialLinks extends BasePage {

    public SocialLinks(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.contacts_socials")
    private WebElement socialDiv;

    public int getNumberOfIcons() {
        int count = 0;
        for (WebElement element : socialDiv.findElements(By.cssSelector("a.socials_link"))) {
            count++;
        }
        return count;
    }


    public void checkUrlClickOnIconAndReturnToMaim() throws InterruptedException {
        Actions actions = new Actions(driver);
        List <String> hrefList = new ArrayList<>();
        hrefList.add("https://www.facebook.com/Hillel.IT.School");
        hrefList.add("https://t.me/ithillel_kyiv");
        hrefList.add("https://www.youtube.com/user/HillelITSchool?sub_confirmation=1");
        hrefList.add("https://www.instagram.com/hillel_itschool/");
        hrefList.add("https://www.linkedin.com/school/ithillel/");


        for (WebElement element : socialDiv.findElements(By.cssSelector("a.socials_link"))) {

            String actualHref = element.getDomAttribute("href");
            if(!hrefList.contains(actualHref)){
                System.out.println("Incorrect url of Social network   " + actualHref);
            }
            actions.click(element).build().perform();
            Set<String> handles = driver.getWindowHandles();
            List<String> listHandles = new ArrayList<>(handles);
            Thread.sleep(1000);
            driver.switchTo().window(listHandles.get(0));
            Thread.sleep(1000);
        }
        Thread.sleep(3000);

    }

    public void checkNewTabParameter() {
        List <WebElement> links = socialDiv.findElements(By.cssSelector("a.socials_link"));

        for (WebElement link : links) {
            String target = link.getDomAttribute("target");
            if("_blank".equals(target)){
                System.out.println("Сторінка " + link.getDomAttribute("href") + " має атрибут, що відповідає за перехід на нову сторінку");
            }else {
                System.out.println("Сторінка " + link.getDomAttribute("href") + " не відкривається в новому вікні");
            }
        }

    }
}
