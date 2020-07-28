package com.lx.service;

import com.lx.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {

    public User findById(Long id);
}
