package com.example.demo;

import org.junit.Test;
import  org.junit.Assert;

public class mywordladderTest {

  @Test
  public void getWord1() {
    mywordladder wl = new mywordladder();
    wl.setWord1("yes");
    String  result = wl.getWord1();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void getWord2() {
    mywordladder wl = new mywordladder();
    wl.setWord2("yes");
    String  result = wl.getWord2();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void getFilename() {
    mywordladder wl = new mywordladder();
    wl.setFilename("yes");
    String  result = wl.getFilename();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void getEmail() {
    mywordladder wl = new mywordladder();
    wl.setEmail("yes");
    String  result = wl.getEmail();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void find_ladder() {
    mywordladder wl = new mywordladder();
    String result=wl.find_ladder("dictionary.txt","hat","cat");
    String tem = "cat->hat";
    Assert.assertTrue("结果正确",result.equals(tem));
  }
}
