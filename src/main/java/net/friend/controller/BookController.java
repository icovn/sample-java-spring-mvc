package net.friend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

  @GetMapping("/")
  public String home(){
    return "index";
  }

  @RequestMapping(name = "/xinChao", method = RequestMethod.GET)
  public String hello(Model model, @RequestParam String name){
    model.addAttribute("name", name);
    return "hello";
  }
}
