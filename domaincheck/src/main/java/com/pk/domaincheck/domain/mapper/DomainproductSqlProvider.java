package com.pk.domaincheck.domain.mapper;

import com.pk.domaincheck.domain.domain.Domainproduct;
import org.apache.ibatis.jdbc.SQL;

public class DomainproductSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    public String insertSelective(Domainproduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("domainproduct");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getVal() != null) {
            sql.VALUES("val", "#{val,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Domainproduct record) {
        SQL sql = new SQL();
        sql.UPDATE("domainproduct");
        
        if (record.getVal() != null) {
            sql.SET("val = #{val,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}