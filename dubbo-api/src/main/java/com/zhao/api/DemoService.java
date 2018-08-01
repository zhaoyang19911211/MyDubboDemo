package com.zhao.api;

import com.zhao.resultDto.Result;
import org.springframework.stereotype.Component;

import javax.management.MXBean;
import java.util.List;

@Component
public interface DemoService {
    void insert(Object obj);
    void del(int id);
    void update(Object obj);
    Result showall();
}
