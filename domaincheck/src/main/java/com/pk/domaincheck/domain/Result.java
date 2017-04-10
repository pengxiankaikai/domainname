package com.pk.domaincheck.domain;

import java.io.Serializable;

/**
 * Created by pengkai
 * @date 2017-04-10.
 */
public class Result implements Serializable{

    private Boolean status; //查询状态

    private Boolean available; //是否能注册

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", available=" + available +
                '}';
    }
}
