/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AccountService
 * Author:   Yuan
 * Date:     2018/10/10 17:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.shsxt.service;


import com.shsxt.dao.AccountMapper;
import com.shsxt.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 *
 * @author Yuan
 * @create 2018/10/10
 * @since 1.0.0
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account selectByPrimaryKey(Integer id){
        return accountMapper.selectByPrimaryKey(id);
    }
}
