package com.java.object;
/*
 * ��������Ӧ�ó���
	* a:���÷���������ֻ����һ�ε�ʱ��
		* ��ô����������������ʲô�ô���?
			* ��ʡ���� 
		* ע�⣺���ö�ε�ʱ�򣬲��ʺϡ��������������Ͼ������������Ա��������������ա�
	* b:�������������Ϊʵ�ʲ�������
 */
public class Test02 {

	public static void main(String[] args) {
		/*Car c1 = new Car();
		/*c1.color = "red";
		c1.num = 4;
		c1.run();
		method(c1);
		
		Car c2 = new Car();		//������������븴����̫�
		c2.color = "red";
		c2.num = 4;
		c2.run();
		method(c2);	*/	
	
		new Car().run();
		
		method(new Car());		//����������Ե�����������
		method(new Car());
		method(new Car());

		
	}
	//��ȡ������ߴ���ĸ����ԣ�����
	public static void method(Car cc){
		cc.color = "red";
		cc.num = 4;
		cc.run();
		
	}

}

class Car{
	int num;
	String color;
	
	public void run(){
		System.out.println("һ��" + color + "��,"+ num  + "��������");
	}
}