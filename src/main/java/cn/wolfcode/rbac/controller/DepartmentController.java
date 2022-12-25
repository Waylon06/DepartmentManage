package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.pojo.Department;
import cn.wolfcode.rbac.service.IDepartmentService;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Waylon
 */

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/list")
    public String selectAll(Model model, QueryObject queryObject) {
        PageInfo<Department> pageResult =  departmentService.selectByPage(queryObject);
        model.addAttribute("pageResult", pageResult);
        return "department/list";
    }

    @RequestMapping("/input")
    public String jump(Long id, Model model) {
        if (id != null) {
            Department department = departmentService.selectById(id);
            model.addAttribute("d", department);
        }
        return "department/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Department department) {
       departmentService.saveOrUpdate(department);
        return "redirect:/department/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        departmentService.delete(id);
        return "redirect:/department/list";
    }
}
