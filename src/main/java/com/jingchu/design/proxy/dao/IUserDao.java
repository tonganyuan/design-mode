package com.jingchu.design.proxy.dao;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/27 22:10
 */
public interface IUserDao {

    @Select("select username from user where id = #{uid}")
    String queryUserInfo(String uid);
}
