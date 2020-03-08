package com.ljs.mapper;

import com.ljs.entity.Admin;

/**
 * 管理员mapper接口
 */
public interface AdminMapper {
    /**
     * 管理员登录
     * @return 管理员实体
     */
    Admin login(Admin admin);
}
