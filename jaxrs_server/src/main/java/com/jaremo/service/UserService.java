package com.jaremo.service;

import com.jaremo.domain.User;

import javax.ws.rs.*;
import java.util.List;

@Path("/pyj") // 这个注解定义在类上: 表明访问当前服务接口的路径
@Produces("*/*") // 服务器支持返回的数据格式类型
public interface UserService {

    @POST // 表示处理请求的类型,insert
    @Path("/user")// 这个注解定义在方法上: 表明访问当前服务接口方法的路径
    @Consumes({"application/xml","application/json"}) // 服务器支持请求的数据格式类型
    public void saveUser(User user);

    @PUT // 表示处理请求的类型,update
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET // 表示处理请求的类型,select
    @Path("/user")
    @Produces({"application/xml","application/json"})
    public List<User> findAllUser();

    @GET
    @Path("/user/{uid}")
    @Consumes("application/xml")
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("uid") Integer uid);

    @DELETE // 表示处理请求的类型,delete
    @Path("/user/{uid}")
    @Consumes({"application/xml","application/json"})
    public void deleteUserByid(@PathParam("uid") Integer uid);
}
