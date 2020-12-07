package com.ngoccp1234.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/index")
public class Test {


    @RequestMapping(method = RequestMethod.GET)
    public String home()
    {
        return "home";
    }

}
