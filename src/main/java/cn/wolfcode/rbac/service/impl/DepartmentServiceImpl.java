package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.dao.DepartmentMapper;
import cn.wolfcode.rbac.pojo.Department;
import cn.wolfcode.rbac.service.IDepartmentService;
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
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public void delete(Long id) {
        departmentMapper.delete(id);
    }

    @Override
    public Department selectById(Long id) {
        return departmentMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Department department) {
        if (department.getId() != null) {
            departmentMapper.update(department);
        }else {
            departmentMapper.save(department);
        }
    }

    @Override
    public PageInfo<Department> selectByPage(QueryObject queryObject) {
        PageHelper.startPage(queryObject.getCurrentPage(), queryObject.getPageSize());
        List<Department> departments = departmentMapper.selectAll();
        return new PageInfo<>(departments);
    }

}
