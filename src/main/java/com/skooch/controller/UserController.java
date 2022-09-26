package com.skooch.controller;

import com.skooch.pojo.User;
import com.skooch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result createUser(@RequestBody User user) {
        boolean flag =  userService.createUser(user);
        return new Result(flag ? Code.POST_OK : Code.POST_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        boolean flag = userService.deleteUser(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{username}")
    public Result getUserByName(@PathVariable String username) {
        List<User> userList = userService.getUserByName(username);
        Integer code = (userList != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (userList != null) ? "查询成功" : "查询失败";
        return new Result(code, userList, msg);
    }

    @GetMapping
    public Result getAllUser() {
        List<User> userList = userService.getAllUser();
        Integer code = (userList != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (userList != null) ? "查询成功" : "查询失败";
        return new Result(code, userList, msg);
    }
}
