package com.dev.server;

import com.dev.model.TbUserLoginPO;
import com.dev.server.fallback.LoginFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "springboot-server-1",fallback = LoginFallback.class)
public interface LoginServer {

    @RequestMapping("/login.do")
    String login(@RequestBody TbUserLoginPO user);
}
