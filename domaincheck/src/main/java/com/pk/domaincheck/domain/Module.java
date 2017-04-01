package com.pk.domaincheck.domain;

import java.io.Serializable;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
public class Module implements Serializable {

    private Integer avail;

    private String name;

    private String tld;

    public Integer getAvail() {
        return avail;
    }

    public void setAvail(Integer avail) {
        this.avail = avail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }
}
