package com.jk.service.impl;




import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.SysUserMapper;
import com.jk.model.TreeBean;
import com.jk.model.Type;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by yangzhichao on 2018-07-09.
 */
@Service("UserService")
public class IUserServiceImpl implements IUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 人脸登录
     * @param accountnumber
     * @return
     */
    @Override
    public List<User> login(String accountnumber) {
        List<User> userList= sysUserMapper.login(accountnumber);
        return userList;
    }
    /**
     * 根据用户手机查询用户
     * @param accountnumber
     * @return
     */
    @Override
    public List<User> queryUserListByPhone(String userphone) {
        List<User> userList= sysUserMapper.queryUserListByPhone(userphone);
        return userList;
    }

    /**
     * 根据账号密码登录
     * @param accountnumber
     * @return
     */
    @Override
    public JSONObject passlogin(User user) {
        JSONObject jsonObj = new JSONObject();
        Integer flag = 0;// 0:用户名不存在 1：密码错误 2：登录成功

        List<User> userlist=sysUserMapper.login(user.getAccountnumber());
        if(userlist != null && userlist.size() > 0){
            flag = 1;
            User newUser  = userlist.get(0);
            if(user.getUserpwd().equals(newUser.getUserpwd())){

                flag = 2;
                //登录成功时，将 数据库中查出来的user对象存到json对象中 返回controller层 存储到session中
                jsonObj.put("nuser", newUser);
            }
        }
        jsonObj.put("flag", flag);
        return jsonObj;
    }

    /**
     * 查询左侧树
     * @return
     */
    @Override
    public List<TreeBean> queryTree() throws Exception {
        String pid="-1";
        List<TreeBean> treeList = getnavlist(pid);
        return treeList;

    }
    private List<TreeBean> getnavlist(String pid)throws Exception {
        List<TreeBean> list=sysUserMapper.queryTree(pid);
        for (TreeBean tree : list) {
            List<TreeBean> getnavlist = getnavlist(tree.getId());
            tree.setChildren(getnavlist);
        }
        return list;
    }
    @Override
    public List<Type> queryTypeTreequeryTypeTree() throws Exception{
        String pid="-1";
        List<Type> typeList = getTypeList(pid);
        return typeList;
    }



    private List<Type> getTypeList(String pid)throws Exception {
        List<Type> list=sysUserMapper.queryType(pid);
        for (Type tree : list) {
            List<Type> getTypeList = getTypeList(tree.getId());
            tree.setChildren(getTypeList);
        }
        return list;
    }
    @Override
    public Integer saveType(Type type) {
        String id =UUID.randomUUID().toString();
        type.setId(id);
        Integer i =sysUserMapper.saveType(type);
        return i;
    }




}
