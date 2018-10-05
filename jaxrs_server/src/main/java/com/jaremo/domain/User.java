package com.jaremo.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/*
    xml:
        <User>
            <uid></uid>
            <userName></userName>
            ...
        </User>
    json:
        {"User":{"uid":100,"userName":'xo',"city":'广州'...}}
 */
@XmlRootElement(name = "User") // 这个注解的作用为 实体类序列化为xml或者json数据的时候,根节点的名称
public class User {

    private Integer uid;
    private String userName;
    private String city;

    private List<Car> carList = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", city='" + city + '\'' +
                ", carList=" + carList +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
