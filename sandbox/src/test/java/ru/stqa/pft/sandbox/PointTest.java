package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testPoint() {
    Point d = new Point(3,5,6,7);
    Assert.assertEquals(d.distance(), 3.605551275463989);
  }
}
