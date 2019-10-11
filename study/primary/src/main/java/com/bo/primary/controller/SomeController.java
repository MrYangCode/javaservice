package com.bo.primary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: supermanYB
 * @Date: 2019/5/6 10:20
 * @Version 1.0
 */
@RestController
public class SomeController {

    @RequestMapping("/hell")
    public String hell(){
        return "hell";
    }

}
