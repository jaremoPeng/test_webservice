package com.jaremo.service.com.jaremo.service.imp;

import com.jaremo.service.HelloService;

public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return name+",Welcome!!!";
    }
}
