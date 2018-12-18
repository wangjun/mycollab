package com.mycollab.module.user.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.user.domain.GroupUser;
import com.mycollab.module.user.domain.GroupUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface GroupUserMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    long countByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insert(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int insertSelective(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    List<GroupUser> selectByExample(GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    GroupUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByExample(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKeySelective(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    int updateByPrimaryKey(GroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    Integer insertAndReturnKey(GroupUser value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group_user
     *
     * @mbg.generated Fri Nov 30 08:06:39 CST 2018
     */
    void massUpdateWithSession(@Param("record") GroupUser record, @Param("primaryKeys") List primaryKeys);
}