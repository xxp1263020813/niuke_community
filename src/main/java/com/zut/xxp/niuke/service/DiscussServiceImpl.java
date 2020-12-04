package com.zut.xxp.niuke.service;

import com.zut.xxp.niuke.dao.DiscussDao;
import com.zut.xxp.niuke.dao.UserDao;
import com.zut.xxp.niuke.entity.Discuss;
import com.zut.xxp.niuke.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DiscussServiceImpl implements DiscussService {

    @Autowired
    private DiscussDao discussDao;

    @Autowired
    private UserDao userMapper;

    @Override
    public List<Map<String, Object>> getDiscussList(int offset, int limit) {
//        User user1 = new User();
//        Optional op = Optional.of(user1);
//        if (op.isPresent()){
//            System.out.println("lwtnbbb");
//        }


        List<Discuss> discussPages = discussDao.getDiscussPages(offset, limit);
        ArrayList<Map<String, Object>> maps = new ArrayList<>();
        for (Discuss discuss : discussPages){
            User user = userMapper.getUser(discuss.getUserId());
            Map<String, Object> map = new HashMap<>();
            map.put("username",user.getUsername());
            map.put("header_url",user.getHeaderUrl());
            map.put("title",discuss.getTitle());
            map.put("push_time",discuss.getCreateTime());
            map.put("type",discuss.getType());
            map.put("status",discuss.getStatus());
            map.put("score",discuss.getScore());
            map.put("comment_count",discuss.getCommentCount());
            maps.add(map);
        }
        return maps;
    }

    @Override
    public Discuss getDiscuss(int id) {
        return discussDao.getDiscuss(id);
    }
}
