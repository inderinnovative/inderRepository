package com.inder.thread;

import java.util.Date;

public class EmpMain {
	static int x;
	public static synchronized void second() {

		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"::"+i+"XX:"+x++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
	}
	public static  String first() {
		System.out.println("FIrst");
		String s="HEY RAM";
		Runnable r1=  ()->second();
		Thread t=new Thread(r1,"Inside first");
		t.start();
		
		return s;
		
	}

	public static void main(String[]args) {
		long start=new Date().getTime();
		System.out.println(first());
		
		System.out.println("Hi"+Thread.currentThread().getName());
		Runnable r1=  ()->{second();};
		
		Runnable r=  new Runnable() {
			
			//@Override
			public void run() {
				System.out.println("t start");
				second();
			}
		};
	Thread t=new Thread(r,"Kumar");
	t.start();

	
	Thread t3 =new Thread(r1,"LAMDA");
	t3.start();
	
	second();
	long end=new Date().getTime();
	System.out.println((end-start)/1000);
		
	}
}
