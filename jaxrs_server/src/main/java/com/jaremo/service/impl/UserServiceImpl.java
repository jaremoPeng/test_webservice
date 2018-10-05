package com.jaremo.service.impl;

import com.jaremo.domain.Car;
import com.jaremo.domain.User;
import com.jaremo.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user"+user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user"+user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUid(1);
        user1.setCity("深圳");
        user1.setUserName("小明");
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setCarName("劳斯莱斯");
        car1.setId(1);
        car1.setPrice(800.00);
        Car car2 = new Car();
        car2.setCarName("玛莎拉蒂");
        car2.setId(2);
        car2.setPrice(500.00);
        user1.setCarList(cars);

        users.add(user1);

        User user2 = new User();
        user2.setUid(2);
        user2.setCity("上海");
        user2.setUserName("小红");

        users.add(user2);
        return users;
    }

    @Override
    public User findUserById(Integer uid) {
        List<User> allUser = findAllUser();
        for (User user: allUser) {
            if(user.getUid().equals(uid)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUserByid(Integer uid) {
        List<User> allUser = findAllUser();
        for (User user: allUser) {
            if(user.getUid().equals(uid)){
                System.out.println("删除成功"+uid+","+user.getUserName());
                return;
            }
        }
        System.out.println("该用户不存在"+uid);
    }
}
