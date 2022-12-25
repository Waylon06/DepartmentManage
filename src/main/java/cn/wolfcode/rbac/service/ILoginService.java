package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.pojo.User;

/**
 * @author Waylon
 */

public interface ILoginService {

    User selectAccount(User user);

    void addUser(User user);
}
