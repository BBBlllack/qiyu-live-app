package org.idea.qiyu.live.api.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.qiye.live.user.interfaces.IUserRpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @DubboReference
    private IUserRpc iUserRpc;

    @GetMapping("/dubbo")
    private String dubbo(){
        return iUserRpc.test();
    }
}
