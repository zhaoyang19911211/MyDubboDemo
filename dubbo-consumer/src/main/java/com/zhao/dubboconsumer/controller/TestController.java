package com.zhao.dubboconsumer.controller;

import com.zhao.api.DemoService;
import com.zhao.dubboprovider.dto.Person;
import com.zhao.resultDto.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/index")
    public String index(){
        return  "forward:/showPerson";
    }
    /**
     * 新增
     */
    @RequestMapping("/addpage")
    public String addpage(){
        return "addPersonPage";
    }
    @RequestMapping("/insert")
    public String insert(Person person){
        demoService.insert(person);
        return "forward:/showPerson";
    }
    /**
     * 删除
     */
    @RequestMapping("/del")
    public String del(int pid){
        System.out.println("进入del....");
        demoService.del(pid);

        return "forward:/showPerson";
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    public String update(Person person){
        System.out.println("进入update方法");
        System.out.println(person);
        demoService.update(person);
        return "forward:/showPerson";
    }
    /**
     *查询
     */
    @RequestMapping("/showPerson")
    public String showPerson(Model model){
        Result result = demoService.showall();
        System.out.println("客服端result:"+result);
        List<Person> data =(List<Person>) result.getData();
        model.addAttribute("personList",data);
        return "personPage";
    }
    /**
     * 获取要修改的信息
     */
    @RequestMapping("/getUpdate")
    public String getUpdate(int id,String pname,String skill,Model model){
        Person person = new Person(id, pname, skill);
        model.addAttribute("person",person);
        return "updatePersonPage";
    }

}
