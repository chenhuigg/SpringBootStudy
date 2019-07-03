package cn.edu.pdsu.springbootdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈辉
 * @version 1.0
 * @time 2019/07/03 17:49
 */
@Controller
public class IndexController {
    @RequestMapping("/first")
    @ResponseBody
    public String first(){
        return "Hello World";
    }
}
