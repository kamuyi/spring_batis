package com.shsxt.service;

import com.github.pagehelper.PageInfo;
import com.shsxt.po.Account;
import com.shsxt.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"} )
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @Test
    public void queryUserById() {
        User user = userService.queryUserById(31);
        System.out.println(user);
    }

    @Test
    public void queryUserByParams() {
        PageInfo<User> userPageInfo=userService.queryUserByParams(1,5,null);
        System.out.println(userPageInfo.getTotal()+"----->"+userPageInfo.getPages());
        List<User> list=userPageInfo.getList();
        list.forEach((temp)-> System.out.println(temp));

    }

    @Test
    public void selectByPrimaryKey(){
        Account account = accountService.selectByPrimaryKey(8);
        System.out.println(account);
    }




}