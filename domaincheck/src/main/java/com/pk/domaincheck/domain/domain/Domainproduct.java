package com.pk.domaincheck.domain.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Domainproduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domainproduct.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domainproduct.val
     *
     * @mbg.generated
     */
    private String val;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domainproduct.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    public Domainproduct(){}

    public Domainproduct(String val) {
        this.val = val;
        this.createtime = new Timestamp(new Date().getTime());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domainproduct.id
     *
     * @return the value of domainproduct.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domainproduct.id
     *
     * @param id the value for domainproduct.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domainproduct.val
     *
     * @return the value of domainproduct.val
     *
     * @mbg.generated
     */
    public String getVal() {
        return val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domainproduct.val
     *
     * @param val the value for domainproduct.val
     *
     * @mbg.generated
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domainproduct.createtime
     *
     * @return the value of domainproduct.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domainproduct.createtime
     *
     * @param createtime the value for domainproduct.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}