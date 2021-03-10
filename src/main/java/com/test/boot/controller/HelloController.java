package com.test.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody 返回字符串给浏览器
/**
 * @Author shiguoqiang
 * @Description RestController就是Controller和ResponseBody的合体
 * @Date 2021/3/9 17:23
 * @Param
 * @return
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle(){
        return "hello";

    }
}
