package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.pojo.Department;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Waylon
 */

public interface IDepartmentService {
    List<Department> selectAll();

    void delete(Long id);

    Department selectById(Long id);

    void saveOrUpdate(Department department);

    PageInfo<Department> selectByPage(QueryObject queryObject);
}
