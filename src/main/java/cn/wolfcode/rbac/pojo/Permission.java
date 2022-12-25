package cn.wolfcode.rbac.pojo;

import lombok.Data;

/**
 * @author Waylon
 */

@Data
public class Permission {
    private Long id;
    private String name;
    private String expression;
}
