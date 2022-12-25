package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.pojo.Permission;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Waylon
 */

public interface IPermissionService {
    List<Permission> selectAll();

    void deleteById(Long id);

    PageInfo<Permission> selectByPage(QueryObject queryObject);
}
