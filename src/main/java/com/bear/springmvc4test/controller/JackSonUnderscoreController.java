package com.bear.springmvc4test.controller;

import com.bear.springmvc4test.vo.UserVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/11 下午4:45
 * Description:
 */

@Controller
@RequestMapping("jackSonUnderscore")
public class JackSonUnderscoreController {

    @GetMapping(value = "index", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody
    UserVo index() throws JsonProcessingException {
        UserVo userVo = new UserVo();
        userVo.setUsername("bear");
        userVo.setGroupId(1);
        userVo.setRoleId(1);
        //userVo.setUsername("bear");
        return userVo;
    }
}
