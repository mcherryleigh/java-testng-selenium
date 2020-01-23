package helpers;

import helpers.YourElement;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface YourDriver extends WebDriver {
    void get(String url);

  String getCurrentUrl();

  String getTitle();

  @Override
  List<WebElement> findElements(By by);

  @Override
  YourElement findElement(By by);

  String getPageSource();

  void close();

  void quit();

  Set<String> getWindowHandles();

  String getWindowHandle();

  TargetLocator switchTo();

  Navigation navigate();

  Options manage();
}