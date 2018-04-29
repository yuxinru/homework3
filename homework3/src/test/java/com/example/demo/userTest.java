package com.example.demo;

import org.junit.Test;
import org.junit.Assert;
import java.util.Map;
import java.util.HashMap;

public class userTest {

  @Test
  public void getEmail() {
    user us = new user();
    us.setEmail("yes");
    String  result = us.getEmail();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void getPassword() {
    user us = new user();
    us.setPassword("yes");
    String  result = us.getPassword();
    String tem="yes";
    Assert.assertTrue("结果正确",result.equals(tem));
  }

  @Test
  public void getData() {
    user us = new user();
    Map<String,String> users = us.getData();
    Map<String,String> test = new HashMap<>();
    test.put("1695565257@qq.com","8877452kk");
    test.put("12345678@google.com","1234567");
    Assert.assertTrue("结果正确",users.equals(test));
  }

  @Test
  public void check() {
    user us = new user();
    String result = us.check("1695565257@qq.com","8877452kk");
    String tem = "2";
    Assert.assertTrue("结果正确",result.equals(tem));
  }
}
