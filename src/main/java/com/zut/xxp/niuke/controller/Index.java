package com.zut.xxp.niuke.controller;

import com.zut.xxp.niuke.dao.DiscussDao;
import com.zut.xxp.niuke.entity.Discuss;
import com.zut.xxp.niuke.service.DiscussService;
import com.zut.xxp.niuke.utill.PageUtile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class Index {

    @Autowired
    private DiscussService discussService;
    @Autowired
    private DiscussDao discussDao;

    @RequestMapping(path = {"/","/index","index.html"})
    public String index(Model model, PageUtile pageUtile){
        pageUtile.setCows(discussDao.getCows());
        pageUtile.setPath("/index");

        List<Map<String, Object>> discussList = discussService.getDiscussList(pageUtile.getForm(), pageUtile.getLimit());
        model.addAttribute("discuss_list",discussList);
        System.out.println(pageUtile.getEnd());

        return "index";
    }
}
