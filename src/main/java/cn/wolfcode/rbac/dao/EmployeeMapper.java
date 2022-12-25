package cn.wolfcode.rbac.dao;

import cn.wolfcode.rbac.pojo.Employee;
import cn.wolfcode.rbac.util.EmployeeQueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAll(EmployeeQueryObject employeeQueryObject);

    Employee selectById(Long id);

    void delete(Long id);

    void update(Employee employee);

    void save(Employee employee);

    void saveEmpAndRole(@Param("id") Long id, @Param("roleId") Long roleId);

    void deleteEmpAndRole(Long id);
}
