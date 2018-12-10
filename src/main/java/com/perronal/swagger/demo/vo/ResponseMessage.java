package com.perronal.swagger.demo.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@Api("ResponseMessage")
public class ResponseMessage<T> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "响应码", name = "data", required = true)
    private T data;  //实体对象

    @ApiModelProperty(value = "响应码", name = "code", required = true, example = "" + SUCCESS_CODE)
    private int code; //返回值

    @ApiModelProperty(value = "错误消息", name = "msg", required = true, example = "参数为空")
    private String msg; //消息


    private static final int SUCCESS_CODE = 200;



    public void setSuccessMessage(T data){
        this.data = data;
        this.code = 200;
        this.msg = "";
    }

    public void  getFailureMessage(String msg){

        this.data = null;
        this.code = 500;
        this.msg = msg;

    }

    public void getFailureMessage(int code, String msg){
        this.data = null;
        this.code = code;
        this.msg = msg;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }
}
