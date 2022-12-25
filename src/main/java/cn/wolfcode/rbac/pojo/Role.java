package cn.wolfcode.rbac.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Waylon
 */

@Data
public class Role {
    private Long id;
    private String name;
    private String sn;
    private List<Permission> permissions;
}
