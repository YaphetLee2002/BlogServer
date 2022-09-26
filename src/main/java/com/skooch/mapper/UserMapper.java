package com.skooch.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skooch.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    // @Insert("insert into user (username, password, description) values (#{username}, #{password}, #{description});")
    public int createUser(User user);

    @Delete("delete from user where id = #{id};")
    public int deleteUser(String id);

    @Select("select * from user where id = #{id};")
    public User getUserById(String id);

    @Select("select * from user where username like concat('%', #{username}, '%');")
    public List<User> getUserByName(String username);

    @Select("select * from user;")
    public List<User> getAllUser();

    @Update("update user set username = #{username}, password = #{password}, description = #{description} where id = #{id};")
    public int updateUser(User user);


}
