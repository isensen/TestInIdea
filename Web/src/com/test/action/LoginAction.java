package com.test.action;

import com.isensen.test.First;
import com.isensen.test.IFirst;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * Created by i33 on 2017-01-03.
 */
public class LoginAction implements Action {
    private String username;
    private String password;
    private String test;

    public String execute() throws Exception {
        if (username.equals("test") && password.equals("test")) {
            ActionContext.getContext().getSession().put("user", getUsername());

            //测试本项目引用其他项目产生的jar包
            IFirst first = new First();
            test = first.test2();
            ActionContext context=ActionContext.getContext();
            //往request里放attribute
            context.put("test1",test);
            //往session里放
            context.getSession().put("test2",test);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
