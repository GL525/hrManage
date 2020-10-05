package com.kgc.service;

import com.kgc.pojo.Person;

import java.util.List;

/**
 * @author 张康硕
 * @create 2020-10-01 22:41
 */
public interface PersonService {
    List<Person> getlist();

    int add(Person person);

    int del(Integer id);
}
