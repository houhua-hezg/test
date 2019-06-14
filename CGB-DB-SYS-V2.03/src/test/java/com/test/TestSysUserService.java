package com.test;
import org.junit.Test;
import com.db.sys.service.SysUserService;
public class TestSysUserService extends TestBase {

	 @Test
	 public void testFindPageObjects() {
		 SysUserService userService=
		 ctx.getBean("sysUserServiceImpl", SysUserService.class);
	     System.out.println(userService.getClass().getName());
	 }
}
