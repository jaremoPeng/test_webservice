package com.jaremo;

import com.jaremo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) // 加载配置文件
@ContextConfiguration("classpath:spring.xml")
public class Client {

    // 注入对象
    @Resource
    private HelloService helloService;

    @Test
    public void remote(){
        System.out.println(helloService.sayHello("liujing"));
    }
}
