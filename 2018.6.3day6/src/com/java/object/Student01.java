package com.java.object;

public class Student01 {	//  测试类！！

	public static void main(String[] args) {
		Student s1 = new Student();		//创建对象！！
		s1.age = 23;					//调用对象中的属性并赋值
		s1.name = "番茄";
		s1.sex = '女';
		
		s1.eat();						//使用成员变量！！
		System.out.println("----------------");
		s1.study();
	}
	
}

class Student{			//  基本类！！
	String name;		//成员变量在类方法外！！
	int age;
	char sex;
	
	public void eat(){
		System.out.println(name + "今年" + age + "岁了,喜欢吃饭");
	}
	
	public void study(){
		System.out.println(name + "是一个好学的" + sex + "生");
	}
}
