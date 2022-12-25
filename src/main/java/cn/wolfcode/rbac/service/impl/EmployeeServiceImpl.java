package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.dao.EmployeeMapper;
import cn.wolfcode.rbac.pojo.Employee;
import cn.wolfcode.rbac.service.IEmployeeService;
import cn.wolfcode.rbac.util.EmployeeQueryObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Waylon
 */

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public Employee selectById(Long id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public PageInfo<Employee> selectByPage(EmployeeQueryObject employeeQueryObject) {
        PageHelper.startPage(employeeQueryObject.getCurrentPage(), employeeQueryObject.getPageSize());
        List<Employee> employees = employeeMapper.selectAll(employeeQueryObject);
        return new PageInfo<>(employees);
    }

    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
        employeeMapper.deleteEmpAndRole(id);
    }

    @Override
    public void saveOrUpdate(Employee employee, Long[] roleIds) {
        if (employee.getId() != null) {
            employeeMapper.update(employee);
            employeeMapper.deleteEmpAndRole(employee.getId());
        }else {
            employeeMapper.save(employee);
        }

        if (roleIds != null) {
            for(Long roleId : roleIds) {
                employeeMapper.saveEmpAndRole(employee.getId(), roleId);
            }
        }

    }
}
