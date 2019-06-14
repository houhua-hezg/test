package com.test;
import java.util.Properties;

import javax.sql.DataSource;
import org.junit.Test;
public class TestDataSource extends TestBase {
	@Test
	public void testProperties() {
		Properties pros=
		ctx.getBean("cfg",Properties.class);
		System.out.println(pros);
	}
	@Test
	public void testDruidDataSource()throws Exception {
		DataSource ds=
		ctx.getBean("dataSource",DataSource.class);
		System.out.println(ds.getConnection());
	}
}
