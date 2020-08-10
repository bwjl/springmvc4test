package com.bear.springmvc4test.component;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/10 下午4:51
 * Description: dispatchServlet和ContextLoaderListener 重复定义bean
 */

public class DispatchServletContextLoaderListenerDuplicateDefineBean {


    private String name;

    /**
     * dispatchServlet和ContextLoaderListener 重复定义bean会被 初始化两次
     */
    public DispatchServletContextLoaderListenerDuplicateDefineBean(String flag) {
        System.out.println("DispatchServletContextLoaderListenerDuplicateDefineBean:" + flag);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
