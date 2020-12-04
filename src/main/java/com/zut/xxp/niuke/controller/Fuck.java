package com.zut.xxp.niuke.controller;

import com.zut.xxp.niuke.entity.Discuss;
import com.zut.xxp.niuke.service.DiscussService;
import com.zut.xxp.niuke.utill.MailUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class Fuck {
    @Autowired
    private DiscussService discussService;

    @Autowired
    private MailUtill mailUtill;

    @RequestMapping("/fuck")
    @ResponseBody
    public Discuss fuck(){
        List<Map<String, Object>> discussList = discussService.getDiscussList(1, 10);
//        if (discussList==null){
//            System.out.println("null");
//        }else {
//            System.out.println("ok");
//        }
//        System.out.println("-----");
        System.out.println(discussList.size());
//        System.out.println(discussList);

        Discuss discuss = discussService.getDiscuss(110);
        System.out.println(discuss);
        mailUtill.sendMail("1263020813@qq.com","test","I love hyd!!");

        return  discuss;
    }
}
