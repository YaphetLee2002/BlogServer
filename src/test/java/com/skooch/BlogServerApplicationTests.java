package com.skooch;

import com.skooch.pojo.User;
import com.skooch.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void createUser(){
        User user = new User();
        user.setUsername("skooch04");
        user.setPassword("1234");
        user.setDescription("Test user");
        System.out.println(user);
        System.out.println(userService.createUser(user));
    }
    @Test
    public void deleteUser(){
        System.out.println(userService.deleteUser(4L));
    }
    @Test
    public void getUserByName(){
        System.out.println(userService.getUserByName("skooch04"));
    }
    @Test
    public void getAllUser(){
        System.out.println(userService.getAllUser());
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(9L);
        user.setUsername("Changed");
        user.setPassword("12345");
        user.setDescription("Changed Description");
        System.out.println(userService.updateUser(user));
    }
}
