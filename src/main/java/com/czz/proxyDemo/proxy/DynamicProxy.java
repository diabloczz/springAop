package com.czz.proxyDemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

public class DynamicProxy implements Movable{
	@Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		DynamicProxy d=new DynamicProxy();
		 System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

	        Movable m = (Movable)Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),
	        		DynamicProxy.class.getInterfaces(), //tank.class.getInterfaces()
	                new TimeProxy(d)
	        );

	        m.move();
	}
}

class TimeProxy implements InvocationHandler {
    Object m;

    public TimeProxy(Object m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Arrays.stream(proxy.getClass().getMethods()).map(Method::getName).forEach(System.out::println);

        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }

}