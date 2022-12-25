package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.pojo.Department;
import cn.wolfcode.rbac.pojo.Employee;
import cn.wolfcode.rbac.pojo.Role;
import cn.wolfcode.rbac.service.IDepartmentService;
import cn.wolfcode.rbac.service.IEmployeeService;
import cn.wolfcode.rbac.service.IRoleService;
import cn.wolfcode.rbac.util.EmployeeQueryObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Waylon
 */

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/list")
        public String list(Model model,@ModelAttribute("qo") EmployeeQueryObject employeeQueryObject) {
        PageInfo<Employee> pageResult = employeeService.selectByPage(employeeQueryObject);
        model.addAttribute("pageResult", pageResult);
        List<Department> departments = departmentService.selectAll();
        model.addAttribute("departments", departments);
        return "employee/list";
    }

    @RequestMapping("/input")
    public String input(Model model, Long id) {
        Employee employee = employeeService.selectById(id);
        model.addAttribute("employee", employee);
        System.out.println(employee);
        List<Department> departments = departmentService.selectAll();
        model.addAttribute("departments", departments);
        List<Role> roles = roleService.selectAll();
        model.addAttribute("roles", roles);
        return "employee/input";
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        employeeService.delete(id);
        return "redirect:/employee/list";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee,Long[] roleIds) {
        employeeService.saveOrUpdate(employee, roleIds);
        return "redirect:/employee/list";
    }

}
