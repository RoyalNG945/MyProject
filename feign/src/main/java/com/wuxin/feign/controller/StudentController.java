package com.wuxin.feign.controller;


import com.wuxin.feign.remote.StudentRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRemote remote;


    @GetMapping(value = "/info")
    public String getById(int id){
        String name = remote.getNameById(id);
        return name;
    }


}
