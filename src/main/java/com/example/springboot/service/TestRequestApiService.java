package com.example.springboot.service;

/**
 * 请求 API 场景
 * @author wangyushuai2@jd.com
 * @date 2019/8/4
 */
public interface TestRequestApiService {
    String URL_HELLO_DETAIL = "http://localhost:8080/api/v1/welcome/{user_name}";
    /**
     * 请求本地HelloController的 helloDetail /hello/id 方法
     * @param userName
     * @return
     */
    String  getHelloDetail(String userName);
}
