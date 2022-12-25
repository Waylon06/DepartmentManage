package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.pojo.Employee;
import cn.wolfcode.rbac.util.EmployeeQueryObject;
import com.github.pagehelper.PageInfo;


/**
 * @author Waylon
 */

public interface IEmployeeService {

    Employee selectById(Long id);

    PageInfo<Employee> selectByPage(EmployeeQueryObject employeeQueryObject);

    void delete(Long id);

    void saveOrUpdate(Employee employee,Long[] roleIds);
}
