package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.dao.PermissionMapper;
import cn.wolfcode.rbac.pojo.Permission;
import cn.wolfcode.rbac.service.IPermissionService;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Waylon
 */

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> selectAll() {
        return permissionMapper.selectAll();
    }

    @Override
    public void deleteById(Long id) {
        permissionMapper.deleteById(id);
    }

    @Override
    public PageInfo<Permission> selectByPage(QueryObject queryObject) {
        PageHelper.startPage(queryObject.getCurrentPage(), queryObject.getPageSize());
        List<Permission> permissions = permissionMapper.selectAll();
        return new PageInfo<>(permissions);
    }
}
