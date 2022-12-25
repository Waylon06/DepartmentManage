package cn.wolfcode.rbac.dao;

import cn.wolfcode.rbac.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> selectAll();

    void save(Department department);

    void delete(Long id);

    Department selectById(Long id);

    void update(Department department);
}
