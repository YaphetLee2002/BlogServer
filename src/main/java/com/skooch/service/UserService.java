package com.skooch.service;

import com.skooch.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    public boolean createUser(User user);

    public boolean deleteUser(Long id);

    public User getUserById(Long id);

    public List<User> getUserByName(String username);

    public List<User> getAllUser();

    public boolean updateUser(User user);
}
