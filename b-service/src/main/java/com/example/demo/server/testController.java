package com.example.demo.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : cywgod
 * @create 2022/4/25 16:58
 */
@RestController
@RequestMapping("b-service/test")
public class testController {

    @GetMapping("/get")
    public Integer get(Integer id) {
        return id;
    }

}
