package com.jaremo;

import com.jaremo.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {

    @Test
    public void testJaxRs(){
        User addUser = new User();
        addUser.setCity("杭州");
        addUser.setUid(3);
        addUser.setUserName("小亮");

        // 通过webclient访问服务端
        WebClient
                .create("http://localhost:8001/rest/pyj/user") // 设置访问服务的地址(POST)
                .type(MediaType.APPLICATION_JSON_TYPE) // 设置请求的数据格式类型
                .encoding("UTF-8")
                .post(addUser); // 设置请求的类型+传参
    }

    @Test
    public void testJaxRs1(){
        User user = WebClient
                .create("http://localhost:8001/rest/pyj/user/1") // 设置访问服务的地址(访问GET请求)
                .accept(MediaType.APPLICATION_JSON_TYPE) // 设置响应的数据格式类型
                .encoding("UTF-8")
                .get(User.class); // 设置请求的类型+返回值类型
        System.out.println(user);
    }

    @Test
    public void testJaxRs2(){
        User editUser = new User();
        editUser.setCity("杭州");
        editUser.setUid(3);
        editUser.setUserName("小亮");

        // 通过webclient访问服务端
        WebClient
                .create("http://localhost:8001/rest/pyj/user") // (PUT)
                .encoding("UTF-8")
                .put(editUser);
    }

    @Test
    public void testJaxRs3(){

        // 通过webclient访问服务端
        WebClient
                .create("http://localhost:8001/rest/pyj/user/1") // (DELETE)
                .delete();
    }
}
