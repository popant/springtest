package com.popant.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anning on 15-11-19.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
