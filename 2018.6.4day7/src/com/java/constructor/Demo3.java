package com.java.constructor;
/*
 * static�ؼ���
 */
public class Demo3 {

	public static void main(String[] arg){
		Demo d1 = new Demo();
		d1.printf();
		System.out.println("----------------------");
		
		Demo.printf2();		//��̬��Ա��������ֱ������������
	}
}

class Demo{
	private int age = 10;
	private static int num = 22;
	
	public void printf(){			//�Ǿ�̬��Ա�������ȿ��Է��ʷǾ�̬��Ա������Ҳ���Է��ʾ�̬��Ա����
		System.out.println(age);	
		System.out.println(num);
	}
	
	public static void printf2(){
		//System.out.println(age); 		��̬�ĳ�Ա���������ܷ��ʷǾ�̬�ĳ�Ա������
		System.out.println(num);
	}
}