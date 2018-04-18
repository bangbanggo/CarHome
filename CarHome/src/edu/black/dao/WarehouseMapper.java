package edu.black.dao;

import edu.black.model.Cars;
import edu.black.model.Warehouse;
import edu.black.model.WarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    long countByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int deleteByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int deleteByPrimaryKey(Integer warehouseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int insert(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int insertSelective(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    List<Warehouse> selectByExample(WarehouseExample example);
    List<Warehouse> selectCarsInWarehouse();
    List<Warehouse> selectByCars(Cars car);
    List<Warehouse> selectByWarehouse(Warehouse warehouse);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    Warehouse selectByPrimaryKey(Integer warehouseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int updateByPrimaryKeySelective(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Tue Apr 17 17:02:12 CST 2018
     */
    int updateByPrimaryKey(Warehouse record);
}