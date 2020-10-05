package com.kgc.service.impl;

import com.kgc.mapper.PersonMapper;
import com.kgc.pojo.Person;
import com.kgc.pojo.PersonExample;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张康硕
 * @create 2020-10-01 22:41
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;
    @Override
    public List<Person> getlist() {
        PersonExample example=new PersonExample();
        PersonExample.Criteria criteria=example.createCriteria();
        List<Person> sales=personMapper.selectByExample(example);
        return sales;
    }

    @Override
    public int add(Person person) {
        int i=personMapper.insertSelective(person);
        return i;
    }

    @Override
    public int del(Integer id) {
        int i=personMapper.deleteByPrimaryKey(id);
        return i;
    }
}
