package com.ljs.service;

import com.ljs.entity.Admin;
import org.springframework.stereotype.Service;


public interface AdminService {
    Admin login(Admin admin);
}
