package com.bear.springmvc4test.controller;

import com.bear.springmvc4test.component.Bear;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/10 上午12:29
 * Description:
 */

@Controller
@RequestMapping("beanInject")
public class BeanInject {

    @Resource
    private Bear bear;

    @GetMapping("index")
    public void index() {
        System.out.println(bear.getName() + "xxx");
    }

}
