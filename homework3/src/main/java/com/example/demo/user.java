package com.example.demo;
import java.util.Map;
import java.util.HashMap;

public class user {
  private String email;
  private String password;
  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return email;
  }
  public void setPassword(String password){
    this.password=password;
  }
  public String getPassword(){
    return password;
  }
  public Map<String,String>getData(){
    Map<String,String>users=new HashMap<>();
    users.put("已登录","正确");                                 //一对特殊的登录密码，不可以被其他用户使用
    users.put("1695565257@qq.com","8877452kk");
    users.put("12345678@google.com","1234567");
    return users;
  }
  public String check(String str1,String str2){
    user users = new user();
    Map<String,String> all_user = users.getData();
    boolean isFind=false;
    for(String s:all_user.keySet()) {
      if(s.equals(str1)) {
        isFind=true;
        if (!(all_user.get(str1)).equals(str2)) {
          return "0";                //密码不正确
        }
      }
    }
    if(!isFind){
      return "1";                   //not found the email;
    }
    return "2";                     //正确;
  }
}
