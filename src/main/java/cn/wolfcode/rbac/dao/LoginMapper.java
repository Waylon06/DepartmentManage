package cn.wolfcode.rbac.dao;

import cn.wolfcode.rbac.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Waylon
 */

public interface LoginMapper {

    User selectAccount(User user);

    void addUser(User user);
}
