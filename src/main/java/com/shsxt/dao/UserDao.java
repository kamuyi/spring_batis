/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserDao
 * Author:   Yuan
 * Date:     2018/10/10 15:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.shsxt.dao;


import com.shsxt.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 *
 *
 * @author Yuan
 * @create 2018/10/10
 * @since 1.0.0
 */
@Repository
public interface UserDao {

    public User queryUserById(Integer id);
    public List<User> queryUserByParams(@Param("userName") String userName);


}
