package com.wen.test.controller;


import com.wen.test.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "thymeleaf")
    public String tesTthymeleaf(ModelMap model){
        Users users= new Users();
        //简单数据演示
        users.setAge(100);
        users.setBirthday(new Date());
        users.setUsername("文");
        //放到mode中，这个类似于request.setAttribute（）一次性使用
        model.addAttribute("users",users);

        //模拟数据库查出来的集合。用在thymeleaf中演示
        List<String> list= new ArrayList<String>();
        for (int i=0;i<10;i++) {
            list.add("我是第"+i+"个");
        }

        model.addAttribute("list",list);

        return "index";
    }

}
