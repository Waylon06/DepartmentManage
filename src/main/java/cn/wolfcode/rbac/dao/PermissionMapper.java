package cn.wolfcode.rbac.dao;

import cn.wolfcode.rbac.pojo.Permission;

import java.util.List;

public interface PermissionMapper {
    List<Permission> selectAll();

    void deleteById(Long id);
}
