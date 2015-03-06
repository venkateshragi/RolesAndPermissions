package com.simplotel.rolesandpermissions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

	@RequestMapping("/add")
	public String addUser(){
		return "add_user";
	}
}
