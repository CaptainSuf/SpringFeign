package com.dev.server.fallback;

import com.dev.model.TbUserLoginPO;
import com.dev.server.LoginServer;
import org.springframework.stereotype.Component;

@Component
public class LoginFallback implements LoginServer {

    @Override
    public String login(TbUserLoginPO user) {
        return "fallback error";
    }
}
