package com.rio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("postmap")
    private String hello() {
        return "postmap";
    }
	
    @RequestMapping("/")
    public String index() {
        return "postmap";
    }
}
