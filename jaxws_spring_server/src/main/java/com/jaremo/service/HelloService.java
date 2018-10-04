package com.jaremo.service;

import javax.jws.WebService;

/**
 * 对外发布服务的接口
 * 需添加这个注解@WebService
 */
@WebService
public interface HelloService {

    public String sayHello(String name);
}
