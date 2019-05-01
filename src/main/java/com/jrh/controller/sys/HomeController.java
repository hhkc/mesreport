package com.jrh.controller.sys;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.HashingPasswordService;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private PasswordMatcher password;
	private SimpleCredentialsMatcher simpleMatcher;
	private AuthenticationStrategy authenStrategy;
	private AbstractAuthenticationStrategy abstractAuthenStragy;
	private PasswordService passwordService;
	private HashingPasswordService hashingPasswordService;
	private DefaultPasswordService defaultPasswordService;
	private SecurityUtils securityUtils;
	
	@RequestMapping("/home")
	public String index(){
		
		return "home/index";
	}
	
	@RequestMapping("/center")
	public String center(){
		return "home/center";
	}
}
