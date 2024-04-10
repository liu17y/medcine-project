package com.gzy.result;

import lombok.Data;

@Data
public class ResultData {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;
    private Object highlight;
    private String token;

    public ResultData() {
    }

    public ResultData(boolean flag, Integer code, String message, Object data, String token) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
        this.token = token;
    }

    public ResultData(boolean flag, String message , Object data, Object highlight) {
        this.flag = flag;
        this.message = message;
        this.data = data;
        this.highlight = highlight;
    }

    public ResultData(boolean flag, Integer code, String message , Object data) {
        this.code = code;
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public ResultData(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

}
