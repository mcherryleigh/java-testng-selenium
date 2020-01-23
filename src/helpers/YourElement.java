package helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public interface YourElement extends WebElement {
    YourElement YourElementImpl();

    void click();

    void submit();

    void sendKeys(CharSequence... keysToSend);

    void clear();
  
    String getTagName();
  
    String getAttribute(String name);
  
    boolean isSelected();
  
    boolean isEnabled();
  
    String getText();

    List<YourElement> findElements(By by);
  
    YourElement findElement(By by);

    boolean isDisplayed();

    Point getLocation();

    Dimension getSize();
  
    Rectangle getRect();
  
    String getCssValue(String propertyName);
}