package com.java.object;

public class Student01 {	//  �����࣡��

	public static void main(String[] args) {
		Student s1 = new Student();		//�������󣡣�
		s1.age = 23;					//���ö����е����Բ���ֵ
		s1.name = "����";
		s1.sex = 'Ů';
		
		s1.eat();						//ʹ�ó�Ա��������
		System.out.println("----------------");
		s1.study();
	}
	
}

class Student{			//  �����࣡��
	String name;		//��Ա�������෽���⣡��
	int age;
	char sex;
	
	public void eat(){
		System.out.println(name + "����" + age + "����,ϲ���Է�");
	}
	
	public void study(){
		System.out.println(name + "��һ����ѧ��" + sex + "��");
	}
}
