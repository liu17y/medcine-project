package com.gzy.dto;

import com.gzy.entity.User;
import lombok.Data;

@Data
public class UserRolePermissionDto extends User {
    private Integer roleId;

    private Integer userId;

}
