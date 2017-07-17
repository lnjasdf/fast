package com.example.fast.controller;

import com.example.fast.entity.TestEntity;
import com.example.fast.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lnjasdf on 2017/7/13.
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    TestMapper testMapper;

    @Value("${test.name}")
    private String name;

    @RequestMapping("")
    public String test() {
        return "test";
    }

    @GetMapping("json")
    public List<TestEntity> testReturnJson() {
        List<TestEntity> testEntities = testMapper.listFilteredUser();
        return testEntities;
    }
}
