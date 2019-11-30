package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends AbstractTest {

  @Test
  public void verifyTitle () {
    Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Software Consulting Firm", "Testing if title is QualityWorks Consulting Group");
  }

}
