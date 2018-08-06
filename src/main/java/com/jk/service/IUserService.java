package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.TreeBean;
import com.jk.model.Type;
import com.jk.model.User;

import java.util.List;

/**
 * @ClassName IUserService
 * @Description
 * @Autohor huanggenchao
 * @DATE 2018/8/3 16:42
 **/
public interface IUserService {
    /**
     * 人脸登录
     * @param accountnumber
     * @return
     */
    List<User> login(String accountnumber);
    /**
     * 根据手机号查询用户
     * @param accountnumber
     * @return
     */
    List<User> queryUserListByPhone(String userphone);
    /**
     * 根据账号密码登录
     * @param accountnumber
     * @return
     */
    JSONObject passlogin(User user);
    /**
     * 查询左侧树
     * @param accountnumber
     * @return
     */
    List<TreeBean> queryTree() throws Exception;
    /**
     * 查询物品类型的treegrid
     * @param accountnumber
     * @return
     */
    List<Type> queryTypeTreequeryTypeTree() throws Exception;
    /**
     * 新增类型
     * @param accountnumber
     * @return
     */
    Integer saveType(Type type);
}
