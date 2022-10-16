package com.skooch;
import java.util.Date;

import com.skooch.mapper.UserMapper;
import com.skooch.pojo.Product;
import com.skooch.pojo.User;
import com.skooch.service.ProductService;
import com.skooch.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductService productService;

    @Test
    public void createUser(){
        User user = new User();
        user.setUsername("createUserTesting");
        user.setPassword("createUserTesting");
        user.setDescription("createUserTesting");
        System.out.println(user);
        System.out.println(userService.createUser(user));
    }

    @Test
    public void deleteUser(){
        System.out.println(userService.deleteUser("1353f84b009e080029713ca0f82dd029"));
    }

    @Test
    public void getUserById() {
        System.out.println(userService.getUserById("2"));
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
        user.setUsername("Changed");
        user.setPassword("12345");
        user.setDescription("Changed Description");
        System.out.println(userService.updateUser(user));
    }

    @Test
    public void addProduct() {
        Product product = new Product();
        product.setId("666");
        product.setPrice(1.0D);
        product.setName("testing");
        product.setDescription("testing");
        product.setDate(new Date());
        product.setUserId("testing");

        productService.addProduct(product);
        System.out.println(product);
    }
}
