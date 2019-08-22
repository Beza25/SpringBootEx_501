package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/page")
    public String page(){
        return "page";
    }
    @RequestMapping("/contactUs")
    public String contactUs(){
        return "contactUs";
    }
}
