package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class helloController {

  @RequestMapping(value ="/login")
  public String toIndex(){
    return "login";
  }
  @RequestMapping(value = "/Main",method=RequestMethod.POST)
  public String usepage(@ModelAttribute("us") user us){
    return "wordladder";
  }

  @RequestMapping(value="/result",method=RequestMethod.POST)
  public String result(@ModelAttribute("wl") mywordladder wl){
    return "result";
  }
}
