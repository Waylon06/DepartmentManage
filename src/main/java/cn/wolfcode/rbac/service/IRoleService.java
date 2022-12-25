package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.pojo.Role;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Waylon
 */

public interface IRoleService {
    PageInfo<Role> selectByPage(QueryObject qo);

    void saveOrUpdate(Role role, Long[] permissionIds);

//    List<Role> selectById(Long id);

    Role selectById(Long id);

    void delete(Long id);

    List<Role> selectAll();
}
