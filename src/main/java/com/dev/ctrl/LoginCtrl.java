package com.dev.ctrl;

import com.dev.model.TbUserLoginPO;
import com.dev.server.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/feign")
public class LoginCtrl {

    @Autowired
    private LoginServer loginServer;

    @ResponseBody
    @RequestMapping(value = "/login.do")
    public String login(TbUserLoginPO user){
       return loginServer.login(user);
    }
}
