package com.jk.mapper;


import com.jk.model.TreeBean;
import com.jk.model.Type;
import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {

    /**
     * 人脸登录
     * @param accountnumber
     * @return
     */
    List<User> login(@Param("accountnumber") String accountnumber);
    /**
     * 根据用户手机查询用户
     * @param
     * @return
     */
    List<User> queryUserListByPhone(@Param("userphone") String userphone);
    /**
     * 查询左侧树
     * @param
     * @return
     */
    List<TreeBean> queryTree(@Param("pid")String pid);
    /**
     * 查询树的类型
     * @param
     * @return
     */
    List<Type> queryType(@Param("pid")String pid);
    /**
     * 新增树的类型
     * @param
     * @return
     */
    Integer saveType(Type type);
}