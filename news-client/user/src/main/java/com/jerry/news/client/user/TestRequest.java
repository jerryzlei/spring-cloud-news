package com.jerry.news.client.user;

import javax.validation.constraints.NotNull;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 22:08 2018/10/29
 * @Modified by:
 */
public class TestRequest {
    @NotNull(message = "name不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
