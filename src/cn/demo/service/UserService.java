package cn.demo.service;

import org.apache.ibatis.annotations.Param;

import cn.demo.pojo.User;

public interface UserService {
	//登录验证 username password
			User loginValider(String userName, String password);
}
