package com.java.object;

public class Test03private {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(230);
		p1.name = "��ѩ";
		p1.speak();
		System.out.println(p1.getAge());
	}

}

class Person{
	String name;
	private int age;
	
	public void setAge(int age){
		
		if(age >= 0 && age <= 200){
			this.age = age;		// this��Ӧ�ó����� �������ֳ�Ա�����;ֲ���������
		}else{
			System.out.println("���Ƕ�������");
		}
	}
	public int getAge(){
		return age;
	}
	
	public void speak(){
		System.out.println(name + "����" + age + "�꣬�ܻὲ�� ");
	}
}