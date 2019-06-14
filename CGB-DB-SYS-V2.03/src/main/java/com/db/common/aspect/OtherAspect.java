package com.db.common.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class OtherAspect {
	   @Pointcut("bean(sysLogServiceImpl)")
	   public void pt() {}
       /**
        * 前置通知 (目标方法执行之前调用)
        */
	   @Before("pt()")
	   public void beforeMethod() {
		   System.out.println("@Before");
	   }
	   /**
	    * 后置通知(目标方法执行之后)
	    */
	   @After("pt()")
	   public void afterMethod() {
		   System.out.println("@After");
	   }
	   /**
	    * 返回通知 (方法正常结束之后)
	    */
	   @AfterReturning("pt()")
	   public void afterReturnMethod() {
		   System.out.println("@AfterReturning");
	   }
	   /**
	    * 异常通知 (目标方法异常结束会执行)
	    */
	   @AfterThrowing("pt()")
	   public void afterThrowMethod() {
		   System.out.println("@AfterThrowing");
	   }
	   
	   @Around("pt()")
	   public Object aroundMethod(ProceedingJoinPoint jp)
	   throws Throwable{
		  System.out.println("aroundMethod.before");
		  Object result=jp.proceed();
		  System.out.println("aroundMethod.after");
		  return result;
	   } 
	   
}
