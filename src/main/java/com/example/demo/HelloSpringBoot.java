package com.example.demo;

import com.example.demo.com.example.pojo.ModelTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSpringBoot {
    @RequestMapping("/hello")
      public String index(){
        ModelTest mt =new ModelTest();
        mt.setName("nihao");

        return mt.getName();
      }
}
