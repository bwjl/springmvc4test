package com.bear.springmvc4test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/4 上午12:33
 * Description:
 */

@Controller
@RequestMapping("index")
public class IndexController {
    @GetMapping("index")
    public void index()
    {
        System.out.println("index");
    }
}
