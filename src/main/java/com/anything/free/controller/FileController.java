package com.anything.free.controller;

import com.anything.free.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @PostMapping("/file/insertFile")
    @ResponseBody
    public Map<String,Object> insertFile(@RequestParam HashMap params){
        Map<String,Object> reqMap = new HashMap<>();
        fileService.insertFile(params);
        reqMap.put("resultCode",200);
        return reqMap;
    }
}
