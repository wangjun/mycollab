package com.mycollab.common.dao;

import com.mycollab.common.domain.CustomerFeedbackExample;
import com.mycollab.common.domain.CustomerFeedbackWithBLOBs;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CustomerFeedbackMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    long countByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByExample(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insert(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insertSelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    List<CustomerFeedbackWithBLOBs> selectByExampleWithBLOBs(CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    CustomerFeedbackWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CustomerFeedbackWithBLOBs record, @Param("example") CustomerFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKeySelective(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CustomerFeedbackWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    Integer insertAndReturnKey(CustomerFeedbackWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_customer_feedback
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void massUpdateWithSession(@Param("record") CustomerFeedbackWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}