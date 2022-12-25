package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.pojo.Permission;
import cn.wolfcode.rbac.pojo.Role;
import cn.wolfcode.rbac.service.IPermissionService;
import cn.wolfcode.rbac.service.IRoleService;
import cn.wolfcode.rbac.util.QueryObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Waylon
 */

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;
    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/list")
    public String list(Model model, QueryObject qo) {
        PageInfo<Role> pageResult = roleService.selectByPage(qo);
        model.addAttribute("pageResult", pageResult);
        return "role/list";
    }

    @RequestMapping("/input")
    public String input(Long id, Model model) {
        if (id != null) {
            Role role = roleService.selectById(id);
            model.addAttribute("role",role);
        }
        List<Permission> permissions = permissionService.selectAll();
        model.addAttribute("permissions", permissions);
        return "role/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role, Long[] permissionIds) {
        roleService.saveOrUpdate(role, permissionIds);
        return "redirect:/role/list";
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        roleService.delete(id);
        return "redirect:/role/list";
    }
}
