package com.common.resopnse;

import lombok.Data;

@Data
public class ResponseResult<T> {

    private Integer code;

    private Boolean success;

    private String message;

    private T data;

    public static <T> ResponseResult<T> success(T data) {

        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.code = 200;
        responseResult.success = true;
        responseResult.message = "success";
        responseResult.data = data;

        return responseResult;
    }

    public static <T> ResponseResult<T> success() {

        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.code = 200;
        responseResult.success = true;
        responseResult.message = "success";
        responseResult.data = null;

        return responseResult;
    }

    public static <T> ResponseResult<T> fail(T data) {

        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.code = 200;
        responseResult.success = false;
        responseResult.message = "fail";
        responseResult.data = data;

        return responseResult;
    }

    public static <T> ResponseResult<T> fail() {

        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.code = 200;
        responseResult.success = false;
        responseResult.message = "fail";
        responseResult.data = null;

        return responseResult;
    }
}
