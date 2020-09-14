package com.czz.proxyDemo.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogUtils {
	@Before("execution(public void com.czz.proxyDemo.proxy.*.move())")
  public void start() {
	  System.out.println("方法开始执行了");
  }
	@After("execution(public void com.czz.proxyDemo.proxy.*.move())")
  public void end() {
	  System.out.println("方法运行结束了");
  }
}
