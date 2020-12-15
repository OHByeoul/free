package com.anything.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/fileUpload")
    public String getFileUploadView(Model model){
        return "/file";
    }

    @GetMapping("/test")
    public String paramTestView(Model model){
        return "/paramTest";
    }

}
