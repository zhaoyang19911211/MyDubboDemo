package com.zhao.dubboprovider.mapper;

import com.zhao.api.DemoService;
import com.zhao.dubboprovider.dto.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper{

    void insert(Object obj);

    void del(int pid);

    void update(Object obj);

    List<Person> showall();
}
