package com.wuxin.feignservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {


    @GetMapping("/info")
    public String getNameById(@RequestParam int id) throws IllegalAccessException {

        int error_code = 123;
        if (error_code == id){
            throw new IllegalAccessException();
        }

        if (StringUtils.isEmpty(String.valueOf(id))){
            return "id is empty";
        }else {
            return "student one";
        }


    }


}
