package com.java.constructor;
/*
 * static关键字
 */
public class Demo3 {

	public static void main(String[] arg){
		Demo d1 = new Demo();
		d1.printf();
		System.out.println("----------------------");
		
		Demo.printf2();		//静态成员方法可以直接类名·调用
	}
}

class Demo{
	private int age = 10;
	private static int num = 22;
	
	public void printf(){			//非静态成员方法，既可以访问非静态成员变量，也可以访问静态成员变量
		System.out.println(age);	
		System.out.println(num);
	}
	
	public static void printf2(){
		//System.out.println(age); 		静态的成员方法，不能访问非静态的成员变量。
		System.out.println(num);
	}
}