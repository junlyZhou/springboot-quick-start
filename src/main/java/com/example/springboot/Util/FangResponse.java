package com.example.springboot.Util;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.objects.annotations.Property;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangyushuai@fang.com on 2018/9/26.
 */
public class FangResponse implements Serializable {

    private final static long serialVersionUID = 1L;

    private int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;
    private String msg;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "lz",timezone = "GMT+8")
    private Date timestamp;
    @JsonIgnore
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }




    public Date getTime() {
        return new Date();
    }

    public void setTime(Date time) {
        this.timestamp = time;
    }

    public FangResponse(int code, String msg, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}