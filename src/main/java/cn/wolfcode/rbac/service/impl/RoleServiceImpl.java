package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.dao.RoleMapper;
import cn.wolfcode.rbac.pojo.Role;
import cn.wolfcode.rbac.service.IRoleService;
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
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public PageInfo<Role> selectByPage(QueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Role> roles = roleMapper.selectAll();
        return new PageInfo<>(roles);
    }

    @Override
    public void saveOrUpdate(Role role, Long[] permissionIds) {
        if (role.getId() != null) {
            roleMapper.update(role);
            roleMapper.deleteRoleAndPer(role.getId());
        }else {
            roleMapper.save(role);
        }
        if (permissionIds != null) {
            for(Long permissionId : permissionIds) {
                roleMapper.saveRoleAndPer(role.getId(), permissionId);
            }
        }
    }

    @Override
    public Role selectById(Long id) {
        return roleMapper.selectById(id);
    }

    @Override
    public void delete(Long id) {
        roleMapper.delete(id);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }
}
