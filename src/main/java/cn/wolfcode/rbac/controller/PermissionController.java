package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.pojo.Permission;
import cn.wolfcode.rbac.service.IPermissionService;
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
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;


    @RequestMapping("/list")
    public String list(Model model, QueryObject queryObject) {
        PageInfo<Permission> pageResult = permissionService.selectByPage(queryObject);
        model.addAttribute("pageResult", pageResult);
        return "permission/list";
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        permissionService.deleteById(id);
        return "redirect:/permission/list";
    }

    @RequestMapping("/reload")
    public String reload() {
        return "redirect:/permission/list";
    }
}
