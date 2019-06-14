package com.test;
import java.util.List;

import org.junit.Test;

import com.db.sys.dao.SysLogDao;
import com.db.sys.entity.SysLog;
public class TestSysLogDao extends TestBase {
	@Test
	public void testFindPageObjects() {
		SysLogDao dao=
		ctx.getBean("sysLogDao",SysLogDao.class);
		List<SysLog> list=
		dao.findPageObjects("admin",0, 3);
		System.out.println(list.size());
	}
	 @Test
	 public void testGetRowCount() {
		 SysLogDao dao=
		 ctx.getBean("sysLogDao",SysLogDao.class);
		 int rowCount=dao.getRowCount("admin");
		 System.out.println(rowCount);
	 }
	
	 @Test
	 public void testDeleteObjects() {
		 SysLogDao dao=
		 ctx.getBean("sysLogDao",SysLogDao.class);
		 int rows=dao.deleteObjects(11,12);
		 System.out.println("delete ok,rows="+rows);
	 }
}
