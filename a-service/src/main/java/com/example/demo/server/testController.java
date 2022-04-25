package com.example.demo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : cywgod
 * @create 2022/4/25 17:33
 */
@RestController
@RequestMapping("a-service/test")
public class testController {

    @GetMapping("/get")
    public String get(Integer id) {
        return "a-service：" + id;
    }
}
