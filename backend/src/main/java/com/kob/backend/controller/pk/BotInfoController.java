package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//返回数据
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("/getBotInfo")
    public String getBotInfo() {
        return "hhhh";
    }
}
