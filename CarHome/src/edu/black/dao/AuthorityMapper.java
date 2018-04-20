package edu.black.dao;

import edu.black.model.Authority;
import edu.black.model.AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    long countByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int deleteByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int deleteByPrimaryKey(Integer authorityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int insert(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int insertSelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    List<Authority> selectByExample(AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    Authority selectByPrimaryKey(Integer authorityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int updateByPrimaryKeySelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    int updateByPrimaryKey(Authority record);
    List<Authority> selectTopMenu();
}