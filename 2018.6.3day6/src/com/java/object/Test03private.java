package com.java.object;

public class Test03private {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(230);
		p1.name = "梦雪";
		p1.speak();
		System.out.println(p1.getAge());
	}

}

class Person{
	String name;
	private int age;
	
	public void setAge(int age){
		
		if(age >= 0 && age <= 200){
			this.age = age;		// this的应用场景： 用来区分成员变量和局部变量重名
		}else{
			System.out.println("你是都教授吗？");
		}
	}
	public int getAge(){
		return age;
	}
	
	public void speak(){
		System.out.println(name + "今年" + age + "岁，很会讲话 ");
	}
}