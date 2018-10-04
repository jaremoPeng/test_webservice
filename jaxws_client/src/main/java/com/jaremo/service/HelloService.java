package com.jaremo.service;

import javax.jws.WebService;

/**
 * 对外发布服务的接口(客户端需要有同服务端相同的接口)
 */
@WebService
public interface HelloService {

    public String sayHello(String name);
}
