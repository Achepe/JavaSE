package com.java.tool;

public class Demo1_ArrayTool {

	public static void main(String[] args) {
		int[] arr = {66,55,77,11,22,44}; 
		
		//ArrayTool at = new ArrayTool();
		int max = ArrayTool.getMax(arr);		//��ȡ��ֵ
		System.out.println(max);
		System.out.println("----------------------");
		
		ArrayTool.print(arr); 					//����ı���
		System.out.println();
		System.out.println("----------------------");
		System.out.println("��ת��");
		ArrayTool.revArray(arr);
		ArrayTool.print(arr);
	}

}
