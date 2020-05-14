package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/type")
@Controller
public class TypeController {
	@RequestMapping("/Type")
	public String Tyep() {
		return "type";
	}
}
