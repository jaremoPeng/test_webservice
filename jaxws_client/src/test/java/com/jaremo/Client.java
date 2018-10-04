package com.jaremo;

import com.jaremo.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {
        // 创建cxf代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        // 指定远程访问服务端的地址
        factory.setAddress("http://localhost:8000/pyj/hello");

        // 设置接口类型
        factory.setServiceClass(HelloService.class);

        // 对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        // 远程访问服务端的方法
        String result = helloService.sayHello("pyj");
        System.out.println(result);
    }
}
