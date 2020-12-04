package com.zut.xxp.niuke.dao;

import com.zut.xxp.niuke.entity.Discuss;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Component
@ComponentScan(basePackages = {"com.zut.xxp.niuke.dao"})
public interface DiscussDao {

    public Discuss getDiscuss(int id);

    public List<Discuss> getDiscussPages(int offset, int limit);

    public int getCows();

}
