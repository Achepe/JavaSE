package com.java.constructor;
	//���췽��
public class Demo1 {

	public static void main(String[] args) {
		Person p = new Person(23,"����");
		p.show();
	}

}

class Person{
	private int age;
	private String name;
	
	public Person(){
		System.out.println("���ǿղι��죡��");
	}
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("�����вι��죡��");
	}
	
	public void show(){
		System.out.println(name + "..." + age);
	}
}