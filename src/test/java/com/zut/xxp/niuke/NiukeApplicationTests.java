package com.zut.xxp.niuke;

import com.zut.xxp.niuke.dao.DiscussDao;
import com.zut.xxp.niuke.entity.Discuss;
import com.zut.xxp.niuke.service.DiscussServiceImpl;
import com.zut.xxp.niuke.utill.MailUtill;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NiukeApplicationTests.class)
class NiukeApplicationTests {


    @Autowired
    private DiscussDao discussDao;



}
