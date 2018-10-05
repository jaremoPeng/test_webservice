package com.jaremo;

import com.jaremo.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        // 创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        // 设置服务地址
        factory.setAddress("http://localhost:8001/rest");

        // 设置服务类
        factory.setServiceBean(new UserServiceImpl());

        // 设置日志输入,输出的拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 发布服务
        factory.create();

        System.out.println("发布服务成功,端口8001...");
    }
}
