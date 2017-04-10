package com.pk.domaincheck.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
public class WanWangResult implements Serializable{

    private Integer errorCode;

    private List<Module> module;

    private Boolean success;

    private String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public List<Module> getModule() {
        return module;
    }

    public void setModule(List<Module> module) {
        this.module = module;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "errorCode=" + errorCode +
                ", module=" + module +
                ", success=" + success +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
