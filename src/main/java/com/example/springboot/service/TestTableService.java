package com.example.springboot.service;

import com.example.springboot.pojo.TestTable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangyushuai@fang.com on 2018/10/23.
 */

public interface TestTableService {
    /**
     * 新增数据
     * @param testTable
     * @return
     */
    boolean add(TestTable testTable);

    /**
     * 删除数据
     * @param id
     * @return
     */
    boolean delete(Long id);

    /**
     * 更新数据
     * @param testTable
     * @return
     */
    boolean update(TestTable testTable);

    /**
     * 查询数据
     * @return
     */
    List<TestTable> selectAll();

    /**
     * 查询打个数据
     * @return
     */
    TestTable selectOne(Long id);


}
