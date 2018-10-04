package com.jaremo;

import com.jaremo.service.com.jaremo.service.imp.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

    public static void main(String[] args) {

        // 创建发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        // 设置服务访问地址
        factory.setAddress("http://localhost:8000/pyj/hello"); // 发布服务成功以后,即可访问这个地址,而后 在该地址后加?wsdl 即可看到使用说明

        // 设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        // 添加日志输入,输出拦截器,观察soap请求,soap响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 创建服务
        factory.create();

        System.out.println("服务发布成功,端口为8000....");
    }
}
