package com.zhao.resultDto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private T data;
    /**
     * 成功提示消息
     */
    private String successMessage;

}
