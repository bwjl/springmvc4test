package com.bear.springmvc4test.vo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/11 下午5:05
 * Description:
 */


@Data
public class UserVo {

    private String username;
    private Integer roleId;
    private Integer groupId;
}
