package com.qf.dao;

import com.qf.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findById(Integer u_id);

    void updateUser(User user);

    void updatePw(User user);
}
