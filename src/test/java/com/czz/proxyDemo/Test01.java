package com.czz.proxyDemo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czz.proxyDemo.proxy.Movable;
import com.czz.proxyDemo.proxy.MyMove1;

public class Test01 {
   @Test
   public void test1() {
	   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	   Movable bean = context.getBean(Movable.class);
	   System.out.println(bean.getClass().getName());
	   bean.move();
   }
   
   
   @Test
   public void test2() {
	   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	   MyMove1 bean = context.getBean(MyMove1.class);
	   System.out.println(bean.getClass().getName());
	   bean.move();
   }
}
