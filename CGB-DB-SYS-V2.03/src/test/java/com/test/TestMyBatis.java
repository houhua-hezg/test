package com.test;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
public class TestMyBatis extends TestBase{
		@Test
		public void testSqlSessionFactory()throws Exception {
			SqlSessionFactory ssf=
			ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
			System.out.println(ssf);
			SqlSession session=ssf.openSession();
			Connection conn=session.getConnection();
			System.out.println(conn);
		}
		
		
		

}
