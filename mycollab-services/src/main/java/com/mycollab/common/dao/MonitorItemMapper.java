package com.mycollab.common.dao;

import com.mycollab.common.domain.MonitorItem;
import com.mycollab.common.domain.MonitorItemExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface MonitorItemMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    long countByExample(MonitorItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByExample(MonitorItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insert(MonitorItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insertSelective(MonitorItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    List<MonitorItem> selectByExample(MonitorItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    MonitorItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") MonitorItem record, @Param("example") MonitorItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExample(@Param("record") MonitorItem record, @Param("example") MonitorItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKeySelective(MonitorItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKey(MonitorItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    Integer insertAndReturnKey(MonitorItem value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_monitor_item
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void massUpdateWithSession(@Param("record") MonitorItem record, @Param("primaryKeys") List primaryKeys);
}