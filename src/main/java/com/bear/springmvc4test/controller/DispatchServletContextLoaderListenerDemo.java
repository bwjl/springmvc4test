package com.bear.springmvc4test.controller;

import com.bear.springmvc4test.component.DispatchServletContextLoaderListenerDuplicateDefineBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/10 下午4:48
 * Description:
 */


@RequestMapping("dispatchServletContextLoaderListener")
public class DispatchServletContextLoaderListenerDemo {

    @Resource
    private DispatchServletContextLoaderListenerDuplicateDefineBean dispatchServletContextLoaderListenerDuplicateDefineBean;

    /**
     * dispatchServlet和ContextLoaderListener
     */
    @GetMapping("duplicateDefineBean")
    public void duplicateDefineBean() {
        //servletContext 定义bean注入 会覆盖 ContextLoaderListener 定义的bean注入
        System.out.println(dispatchServletContextLoaderListenerDuplicateDefineBean.getName()); //DispatchServlet:DispatchServletContextLoaderListenerDuplicateDefineBean
    }

}
