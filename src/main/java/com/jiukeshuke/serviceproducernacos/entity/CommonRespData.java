package com.jiukeshuke.serviceproducernacos.entity;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2017-12-04
 **/
public class CommonRespData implements Serializable {


    private static final long serialVersionUID = 2188514627544221680L;

    private int status;

    private String message;

    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
