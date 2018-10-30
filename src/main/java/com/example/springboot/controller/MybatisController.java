package com.example.springboot.controller;

import com.example.springboot.Util.FangResponse;
import com.example.springboot.pojo.TestTable;
import com.example.springboot.service.TestTableService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by wangyushuai@fang.com on 2018/10/23.
 * SpringBoot2.X 整合 Mybatis 3.x
 * 事务处理
 */
@RestController
@RequestMapping("/mybatis/test_table")
public class MybatisController {

    @Autowired
    TestTableService service;

    @PostMapping("/add")
    public FangResponse testTableAdd(@Valid TestTable testTable) {
       testTable.setCreateTime(new Date());
       boolean result =  service.add(testTable);
       return FangResponse.buildSuccess(result);
    }


    @PostMapping("/delete")
    public FangResponse testTableDelete(@RequestParam("id")  Long id) {
        return FangResponse.buildSuccess(service.delete(id));
    }

    @PostMapping("/update")
    public FangResponse testTableUpdate(TestTable testTable) {
        return FangResponse.buildSuccess(service.update(testTable));
    }



    @GetMapping("/select_one")
    public FangResponse testTableSelectOne(@RequestParam("id") Long id) {
        TestTable testTable = service.selectOne(id);
        return FangResponse.buildSuccess(testTable);
    }


    @GetMapping("/select_all")
    public FangResponse testTableSelectAll() {
        List<TestTable> list = service.selectAll();
        return FangResponse.buildSuccess(list);
    }

}