
package com.niit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController
{
    @RequestMapping("/")
    public String indexPage()
    {
        return "index";
    }
    
    @RequestMapping("/login-page")
    public String loginage()
    {
        return "login";
    }
    
    @RequestMapping("/sign-up")
    public String register()
    {
        return "register";
    }
}
