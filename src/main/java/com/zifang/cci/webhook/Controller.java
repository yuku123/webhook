package com.zifang.cci.webhook;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {
    @PostMapping("/webhook/refresh")
    public void refresh(@RequestBody HashMap map){
        System.out.println(new Gson().toJson(map));
        System.out.println("接收到请求了");
    }
}
