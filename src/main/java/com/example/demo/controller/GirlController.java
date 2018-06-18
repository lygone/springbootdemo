package com.example.demo.controller;

import com.example.demo.dao.GirlRep;
import com.example.demo.some.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by panyi on 2018/5/27.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRep girlRep;

    @RequestMapping(value = "/girls",method = RequestMethod.GET)
    public List<Girl> getGirlList(){
        return girlRep.findAll();
    }

    @RequestMapping(value = "/addgirl",method = RequestMethod.GET)
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRep.save(girl);
    }

    @RequestMapping(value = "/selectgirl",method = RequestMethod.GET)
    public Optional<Girl> searchGirl(@RequestParam("id")Integer id){
        return girlRep.findById(id);
    }
}
