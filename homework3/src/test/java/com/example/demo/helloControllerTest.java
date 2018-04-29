package com.example.demo;

import org.junit.Test;
import org.junit.Assert;

public class helloControllerTest {

  @Test
  public void toIndex() {
    helloController hc = new helloController();
    String result = hc.toIndex();
    String tem="login";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void usepage() {
    helloController hc = new helloController();
    user us = new user();
    String result = hc.usepage(us);
    String tem="wordladder";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void result() {
    helloController hc = new helloController();
    mywordladder wl = new mywordladder();
    String result = hc.result(wl);
    String tem="result";
    Assert.assertTrue("结果正确",result.equals(tem));
  }
}
