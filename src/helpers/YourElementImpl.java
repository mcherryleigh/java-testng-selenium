package helpers;

import helpers.YourElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class YourElementImpl implements YourElement {

    private final WebElement element;

    public YourElementImpl(final WebElement element) {
        this.element = element;
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public YourElement findElement(By by) {
        return element.findElement(by);
    }
    
    @Override
    public List<YourElement> findElements(By by) {
        return element.findElements(by);
    }
    
    @Override
    public String getAttribute(String name) {
        return element.getAttribute(name);
    }

    @Override
    public String getCssValue(String propertyName) {
        return element.getCssValue(propertyName);
    }

    @Override
    public Point getLocation() {
        return element.getLocation();
    }

    @Override
    public Rectangle getRect() {
        return element.getRect();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return element.getScreenshotAs(target);
    }

    @Override
    public Dimension getSize() {
        return element.getSize();
    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }
    @Override
    public boolean isSelected() {
        return element.isSelected();
    }
    @Override
    public void sendKeys(CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    @Override
    public void submit() {
        element.click();
    }
}