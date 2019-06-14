package com.test;

import org.apache.ibatis.javassist.expr.Instanceof;
import org.junit.Test;

import com.db.common.vo.PageObject;
import com.db.sys.entity.SysLog;
import com.db.sys.service.SysLogService;

public class TestSysLogService extends TestBase {
	@Test
	public void testFindPageObjects() {
		SysLogService service=
		ctx.getBean("sysLogServiceImpl",
				SysLogService.class);
	    PageObject<SysLog> po=
	    service.findPageObjects("admin",null);
	    System.out.println(po.getPageCount());
	}
}









