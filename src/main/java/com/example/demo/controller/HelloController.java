package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by panyi on 2018/5/27.
 */
@RestController //等同于同时加上了@Controller和@ResponseBody
public class HelloController {
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "Hi Lygone~";
    }
}
