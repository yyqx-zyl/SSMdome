package cn.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.demo.pojo.User;

@Repository
public interface UserDao {
	//登录验证 username password
		User loginValider(@Param("username") String userName,
				@Param("userpassword") String password);
}
