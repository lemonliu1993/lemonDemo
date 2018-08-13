package com.lemon.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lemoon on 18/8/13 下午8:34
 */

//该注解表示这个类对应数据库里的一张表，
@Entity
public class Girl {


    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;

    private Integer age;


    public Girl(){

    }
    //必须要有无参构造器，不然数据库报错


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
