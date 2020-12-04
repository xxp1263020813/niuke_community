package com.zut.xxp.niuke.service;

import com.zut.xxp.niuke.entity.Discuss;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DiscussService {

    public List<Map<String ,Object>> getDiscussList(int offset, int limit);
    public Discuss getDiscuss(int id);
}
