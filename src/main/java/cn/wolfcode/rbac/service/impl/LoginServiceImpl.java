package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.dao.LoginMapper;
import cn.wolfcode.rbac.pojo.User;
import cn.wolfcode.rbac.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Waylon
 */

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;


    @Override
    public User selectAccount(User user) {
        return loginMapper.selectAccount(user);
    }

    @Override
    public void addUser(User user) {
        loginMapper.addUser(user);
    }
}
