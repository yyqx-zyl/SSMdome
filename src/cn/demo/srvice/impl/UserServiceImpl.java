package cn.demo.srvice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.demo.dao.UserDao;
import cn.demo.pojo.User;
import cn.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;
	
	@Override
	public User loginValider(String userName, String password) {
		return userdao.loginValider(userName, password);
	}

}
