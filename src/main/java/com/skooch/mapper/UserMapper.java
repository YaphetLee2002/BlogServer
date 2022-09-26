package com.skooch.mapper;


import com.skooch.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    // @Insert("insert into user (username, password, description) values (#{username}, #{password}, #{description});")
    public int createUser(User user);

    @Delete("delete from user where id = #{id};")
    public int deleteUser(Integer id);

    @Select("select * from user where username like concat('%', #{username}, '%');")
    public List<User> getUserByName(String username);

    @Select("select * from user;")
    public List<User> getAllUser();
}
