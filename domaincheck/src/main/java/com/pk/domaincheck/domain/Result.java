package com.pk.domaincheck.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
public class Result implements Serializable{

    private Integer errorCode;

    private List<Module> module;

    private Boolean success;

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
}
