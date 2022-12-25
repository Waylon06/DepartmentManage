package cn.wolfcode.rbac.pojo;

import lombok.Data;

/**
 * @author Waylon
 */

@Data
public class User {
    private String account;
    private String password;
    private String email;
}
