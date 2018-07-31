package com.java.tool;

public class Demo1_ArrayTool {

	public static void main(String[] args) {
		int[] arr = {66,55,77,11,22,44}; 
		
		//ArrayTool at = new ArrayTool();
		int max = ArrayTool.getMax(arr);		//获取最值
		System.out.println(max);
		System.out.println("----------------------");
		
		ArrayTool.print(arr); 					//数组的遍历
		System.out.println();
		System.out.println("----------------------");
		System.out.println("反转后：");
		ArrayTool.revArray(arr);
		ArrayTool.print(arr);
	}

}
