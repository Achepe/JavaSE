package com.java.tool;
/*
    * 1,获取最大值
	* 2,数组的遍历
	* 3,数组的反转
 */
class ArrayTool {
	
	//如果一个类中所有的方法都是静态的，需要在多做一步，私有构造方法，目的是让其他类不创建本类对象
	//直接用类名·调用
	private ArrayTool(){}
	
	//1,获取最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//2,数组的遍历
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//3,数组的反转
	public static void revArray(int[] arr){
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}
