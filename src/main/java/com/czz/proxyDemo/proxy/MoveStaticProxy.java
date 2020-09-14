package com.czz.proxyDemo.proxy;

public class MoveStaticProxy {
    private Movable m;
    
    public MoveStaticProxy(Movable m) {
    	this.m=m;
    }
    
    public void move() {
    	System.out.println("MoveStaticProxy.move() begin...");
    	m.move();
    	System.out.println("MoveStaticProxy.move() end...");
    }
}
