package com.zhao.dubboprovider.imp;


import com.github.pagehelper.PageHelper;
import com.zhao.api.DemoService;
import com.zhao.dubboprovider.dto.Person;
import com.zhao.dubboprovider.mapper.PersonMapper;
import com.zhao.resultDto.Result;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoServiceImpl implements DemoService {
    @Resource
    private PersonMapper personMapper;
    @Override
    public void insert(Object obj) {
        System.out.println(obj);
        personMapper.insert(obj);
    }

    @Override
    public void del(int pid) {
        personMapper.del(pid);
    }

    @Override
    public void update(Object obj) {
        personMapper.update(obj);
    }

    @Override
    public Result showall( ) {
        List<Person> list =personMapper.showall();
        Result<List> result = new Result<>();
        result.setData(list);
        System.out.println("服务端result:"+result);
        return result;
    }
}
