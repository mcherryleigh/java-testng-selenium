package helpers;

import helpers.YourElement;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourDriverImpl implements YourDriver {

    private final WebDriver driver;

    public YourDriverImpl(final WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public YourElement findElement(By by) {
        YourElement elem = new YourElementImpl(driver.findElement(by));
        return elem;
    }

    // TODO change WebElement to YourElement, currently some sort of conflict with extended class
    @Override
    public List<WebElement> findElements(By by) {
        List<WebElement> elemsIn = driver.findElements(by);
        return elemsIn;
        /**
        List<YourElement> elemsOut = elemsIn.stream()
        .map(elem -> {
            return new YourElementImpl(elem);
        })
        .collect(Collectors.toList());
        return elemsOut;
        */
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override 
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }
    
    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public void quit() {
        driver.quit();        
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    // TODO do I need to include nested interfaces like Options?
}