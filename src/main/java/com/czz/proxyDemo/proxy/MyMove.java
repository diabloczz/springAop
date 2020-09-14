package com.czz.proxyDemo.proxy;

import org.springframework.stereotype.Service;

@Service
public class MyMove implements Movable{

	@Override
	public void move() {
	 System.out.println("My move kaca kaca...");		
	}
	
	public static void main(String[] args) {
		MyMove move=new MyMove();
		MoveStaticProxy p=new MoveStaticProxy(move);
		p.move();
	}

}
