package org.example.grace.result;

import java.util.Map;

/**
 * 自定义响应数据类型枚举升级版本
 *
 * @Title: IMOOCJSONResult.java
 * @Package ord.example.utils
 * @Description: 自定义响应数据结构
 * 				前端接受此类数据（json object)后，可自行根据业务去实现相关功能
 *
 */
public class GraceJSONResult {

    // 响应业务状态码
    private Integer status;

    // 响应消息
    private String msg;

    // 是否成功
    private Boolean success;

    // 响应数据，可以是Object，也可以是List或Map等
    private Object data;

    /**
     * successful return with data
     * @param data
     * @return
     */
    public static GraceJSONResult ok(Object data) {
        return new GraceJSONResult(data);
    }
    /**
     * successful return without data
     * @return
     */
    public static GraceJSONResult ok() {
        return new GraceJSONResult(ResponseStatusEnum.SUCCESS);
    }
    public GraceJSONResult(Object data) {
        this.status = ResponseStatusEnum.SUCCESS.status();
        this.msg = ResponseStatusEnum.SUCCESS.msg();
        this.success = ResponseStatusEnum.SUCCESS.success();
        this.data = data;
    }


    /**
     * error
     * @return
     */
    public static GraceJSONResult error() {
        return new GraceJSONResult(ResponseStatusEnum.FAILED);
    }

    /**
     * return error with data in map
     * @param map
     * @return
     */
    public static GraceJSONResult errorMap(Map map) {
        return new GraceJSONResult(ResponseStatusEnum.FAILED, map);
    }

    /**
     * return error message
     * @param msg
     * @return
     */
    public static GraceJSONResult errorMsg(String msg) {
        return new GraceJSONResult(ResponseStatusEnum.FAILED, msg);
    }

    /**
     * return error with invalid token
     * @return
     */
    public static GraceJSONResult errorTicket() {
        return new GraceJSONResult(ResponseStatusEnum.TICKET_INVALID);
    }

    /**
     * return error with defined status
     * @param responseStatus
     * @return
     */
    public static GraceJSONResult errorCustom(ResponseStatusEnum responseStatus) {
        return new GraceJSONResult(responseStatus);
    }
    public static GraceJSONResult exception(ResponseStatusEnum responseStatus) {
        return new GraceJSONResult(responseStatus);
    }

    public GraceJSONResult(ResponseStatusEnum responseStatus) {
        this.status = responseStatus.status();
        this.msg = responseStatus.msg();
        this.success = responseStatus.success();
    }
    public GraceJSONResult(ResponseStatusEnum responseStatus, Object data) {
        this.status = responseStatus.status();
        this.msg = responseStatus.msg();
        this.success = responseStatus.success();
        this.data = data;
    }
    public GraceJSONResult(ResponseStatusEnum responseStatus, String msg) {
        this.status = responseStatus.status();
        this.msg = msg;
        this.success = responseStatus.success();
    }

    public GraceJSONResult() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}

