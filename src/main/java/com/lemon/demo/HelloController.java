package com.lemon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@RequestMapping("/hello")
public class HelloController {

//    //通过注解读取配置属性,格式"${name}",要加$
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/hello","hi"} ,method = RequestMethod.GET)
    @RequestMapping(value = "/say/{id}" ,method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
//        return girlProperties.getCupSize();
//        return "index";
        return "id:" +id;
    }

//    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    @GetMapping
    public String hi(@RequestParam(value = "id", required = false,defaultValue = "0") Integer myId){
        return "id:" +myId;
    }
}
