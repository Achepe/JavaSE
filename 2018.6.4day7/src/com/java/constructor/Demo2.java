package com.java.constructor;
/*
 * * ѧ���ࣺ
		* ��Ա������
			* name��age
		* ���췽����
			* �޲Σ���������
		* ��Ա������
			* getXxx()/setXxx()
			* show()�������������г�Ա����ֵ
 */
public class Demo2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(23);
		s.setName("����");
		
		System.out.println(s.getName() + "..." + s.getAge());
		Student s2 = new Student(23, "����");
		s2.show();	//ֻ��Ϊ����ʾ����ֵ
	}

}

class Student{
	private int age;
	private String name;
	
	public Student(){}		//�ղι���
	
	public Student(int age, String name){	//�вι���
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