package com.techybear.techybearsite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomoPageController {

    @RequestMapping("/")
    public String getHomepage(){
        return "homepage";
    }
}
