package com.java.object;
/*
 * ��������ʽ������������ʱ����ε��ã���
 */
public class Test01 {

	public static void main(String[] args) {
		print(10);
		
		Student1 s1 = new Student1();	//	�������󣬲�������ĵ�ֵַ��ֵ��s1
		print(s1);	//������������һ�������ǲ�����һ������Ϊ���������أ�������
	}
	
	public static void print(int x){	//�����������͵�����ʽ��������
		System.out.println(x);
	}
	
	public static void print(Student1 stu){	//�����������͵�����ʽ��������(����ֵַ)
		stu.age = 22;
		stu.name = "��ɽ��";
		stu.sex = 'Ů';
		
		stu.eat();
	}
}

class Student1{			//  �����࣡��
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