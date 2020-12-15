package com.anything.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @PostMapping("/arrayParamTest")
    public void testParam(@RequestParam HashMap<String,Object> managerList){
        System.out.println("managerList.get(0).get(\"managerList\") = " + managerList.get("managerList"));
    }
}
