package com.java.constructor;
	//构造方法
public class Demo1 {

	public static void main(String[] args) {
		Person p = new Person(23,"张三");
		p.show();
	}

}

class Person{
	private int age;
	private String name;
	
	public Person(){
		System.out.println("这是空参构造！！");
	}
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("这是有参构造！！");
	}
	
	public void show(){
		System.out.println(name + "..." + age);
	}
}