package com.qf.service;

import com.qf.domain.User;

public interface UserService {
    User findById(Integer u_id);

    void updateUser(User user);

    void updatePw(User user);
}
