/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserService
 * Author:   Yuan
 * Date:     2018/10/10 15:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.shsxt.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.dao.UserDao;
import com.shsxt.po.Account;
import com.shsxt.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 *
 * @author Yuan
 * @create 2018/10/10
 * @since 1.0.0
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserById(Integer id){
        return  userDao.queryUserById(id);
    }

    public PageInfo<User> queryUserByParams(Integer pageNum, Integer pageSize, String userName){

        PageHelper.startPage(pageNum,pageSize);
        List<User> list=userDao.queryUserByParams(userName);
        PageInfo<User> userPageInfo=new PageInfo<User>(list);
        return userPageInfo;
    }


}
