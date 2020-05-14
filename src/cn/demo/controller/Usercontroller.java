package cn.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.demo.pojo.User;
import cn.demo.service.UserService;

@RequestMapping("/user")
@Controller
public class Usercontroller {

	@Autowired
	private UserService userService;
	
	//请求方法
	@RequestMapping(value = "/dologin",method = RequestMethod.POST)
	public String dologin(@RequestParam("username") String userName,
			@RequestParam("userpassword") String userpassword,
			HttpSession session) {
		User user=userService.loginValider(userName, userpassword);
		if(user !=null) {
			session.setAttribute("loginUser", user);
			return "redirect:index";
		}
		return "/";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/User")
	public String getUserList() {
		return "user";
	}
	
	
}
