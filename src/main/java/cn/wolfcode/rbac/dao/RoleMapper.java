package cn.wolfcode.rbac.dao;

import cn.wolfcode.rbac.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    List<Role> selectAll();

    void update(Role role);

    void save(Role role);

//    List<Role> selectById(Long id);

    Role selectById(Long id);

    void delete(Long id);

    void saveRoleAndPer(@Param("id") Long id, @Param("permissionId") Long permissionId);

    void deleteRoleAndPer(Long id);
}
