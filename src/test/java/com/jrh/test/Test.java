package com.jrh.test;

import java.security.Key;
import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;

public class Test {

/*	
	@org.junit.Test
	public void test(){
		 //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =  
	            new IniSecurityManagerFactory("classpath:shiro.ini");  
	    //2、得到SecurityManager实例 并绑定给SecurityUtils  
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
	    SecurityUtils.setSecurityManager(securityManager);  
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
	    Subject subject = SecurityUtils.getSubject();  
	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");  
	  
	    try {  
	        //4、登录，即身份验证  
	        subject.login(token);  
	    } catch (AuthenticationException e) {  
	    	System.out.println("错误");
	        //5、身份验证失败  
	    }  
	  
	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录  
	  
	    //6、退出  
	    subject.logout();  
	}
	*/
/*	@org.junit.Test
	public void testHasRole() {  
		    
	    login("classpath:shiro-role.ini", "zhang", "123");  
	    //判断拥有角色：role1  
	    Assert.assertTrue(subject().hasRole("role1"));  
	    //判断拥有角色：role1 and role2  
	    Assert.assertTrue(subject().hasAllRoles(Arrays.asList("role1", "role2")));  
	    //判断拥有角色：role1 and role2 and !role3  
	    boolean[] result = subject().hasRoles(Arrays.asList("role1", "role2", "role3"));  
	    Assert.assertEquals(true, result[0]);  
	    Assert.assertEquals(true, result[1]);  
	    Assert.assertEquals(false, result[2]);  
	}   */
	
/*	@org.junit.Test(expected = UnauthorizedException.class)  
	public void testIsPermitted() {  
	    login("classpath:shiro-permission.ini", "zhang", "123");  
	    //断言拥有权限：user:create  
	    subject().checkPermission("user:create");  
	    //断言拥有权限：user:delete and user:update  
	    subject().checkPermissions("user:delete", "user:update");  
	    //断言拥有权限：user:view 失败抛出异常  
	    subject().checkPermissions("user:view"); 
	} */  
	
	@org.junit.Test
	public void test(){
		AesCipherService aesCipherService = new AesCipherService();  
		aesCipherService.setKeySize(128); //设置key长度  
		//生成key  
		Key key = aesCipherService.generateNewKey();  
		String text = "hello";  
		//加密  
		String encrptText =   
		aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();  
		//解密  
		String text2 =  
		 new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());  
		  
		Assert.assertEquals(text, text2); 
	}
	
	private void login(String path,String name,String password) {  
	    //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =  
	            new IniSecurityManagerFactory(path);  
	  
	    //2、得到SecurityManager实例 并绑定给SecurityUtils  
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
	    SecurityUtils.setSecurityManager(securityManager);  
	  
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
	    Subject subject = SecurityUtils.getSubject();  
	    UsernamePasswordToken token = new UsernamePasswordToken(name, password);  
	  
	    subject.login(token);  
	}  
	
	public Subject subject(){
		 //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =  
	            new IniSecurityManagerFactory("classpath:shiro-permission.ini");  
	  
	    //2、得到SecurityManager实例 并绑定给SecurityUtils  
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
	    SecurityUtils.setSecurityManager(securityManager);  
	  
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
	    Subject subject = SecurityUtils.getSubject();  
	    
	    return subject;
	}
}
