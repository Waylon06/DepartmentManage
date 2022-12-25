package cn.wolfcode.rbac.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Waylon
 */

@Data
public class Employee {
    private Long id;
    private String name;
    private String password;
    private String email;
    private int age;
    private boolean admin;
    private Department dept;
    private List<Role> roles;
}
