package cn.edu.pdsu.springbootdemo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈辉
 * @version 1.0
 * @time 2019/07/03 17:49
 */
/*
根据声明的依赖进行自动配置，扫包范围在当前类，
它有属性exclude可以用来排除自动配置。
 */
@EnableAutoConfiguration(exclude = {})
@Controller
@PropertySource(value = "classpath:book.properties")
@ConfigurationProperties(prefix = "book")
public class IndexController {
    //获取自定义属性的值
    @Value("${IMAGE_SERVER}")
    private  String image_server;
    private  String author;
    private  String name;

    public String getImage_server() {
        return image_server;
    }

    public void setImage_server(String image_server) {
        this.image_server = image_server;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @RequestMapping("/first")
    @ResponseBody
    public String first(){
        System.out.println(image_server);
        System.out.println(author);
        System.out.println(name);
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(IndexController.class);
    }

}
