package com.pk.domaincheck.domain.mapper;

import com.pk.domaincheck.base.mapper.BaseMapper;
import com.pk.domaincheck.domain.domain.Domainproduct;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DomainproductMapper extends BaseMapper<Domainproduct>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @Delete({
        "delete from domainproduct",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @Insert({
        "insert into domainproduct (id, val, ",
        "createtime)",
        "values (#{id,jdbcType=INTEGER}, #{val,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(Domainproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @InsertProvider(type=DomainproductSqlProvider.class, method="insertSelective")
    int insertSelective(Domainproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, val, createtime",
        "from domainproduct",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="val", property="val", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    Domainproduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @UpdateProvider(type=DomainproductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Domainproduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domainproduct
     *
     * @mbg.generated
     */
    @Update({
        "update domainproduct",
        "set val = #{val,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Domainproduct record);

    @Select({
            "select",
            "id, val, createtime",
            "from domainproduct",
            "order by id desc limit 0,1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="val", property="val", jdbcType=JdbcType.VARCHAR),
            @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    Domainproduct selectLastOne();
}