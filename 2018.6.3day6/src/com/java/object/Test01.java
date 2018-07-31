package com.java.object;
/*
 * 方法的形式参数是类名的时候如何调用？？
 */
public class Test01 {

	public static void main(String[] args) {
		print(10);
		
		Student1 s1 = new Student1();	//	创建对象，并将对象的地址值赋值给s1
		print(s1);	//两个方法名字一样，但是参数不一样，成为方法的重载！！！！
	}
	
	public static void print(int x){	//基本数据类型当作形式参数！！
		System.out.println(x);
	}
	
	public static void print(Student1 stu){	//引用数据类型当作形式参数！！(给地址值)
		stu.age = 22;
		stu.name = "穿山甲";
		stu.sex = '女';
		
		stu.eat();
	}
}

class Student1{			//  基本类！！
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