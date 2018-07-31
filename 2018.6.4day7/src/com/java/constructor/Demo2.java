package com.java.constructor;
/*
 * * 学生类：
		* 成员变量：
			* name，age
		* 构造方法：
			* 无参，带两个参
		* 成员方法：
			* getXxx()/setXxx()
			* show()：输出该类的所有成员变量值
 */
public class Demo2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(23);
		s.setName("张三");
		
		System.out.println(s.getName() + "..." + s.getAge());
		Student s2 = new Student(23, "张三");
		s2.show();	//只是为了显示属性值
	}

}

class Student{
	private int age;
	private String name;
	
	public Student(){}		//空参构造
	
	public Student(int age, String name){	//有参构造
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void show(){
		System.out.println(name + "..." + age);
	}
}