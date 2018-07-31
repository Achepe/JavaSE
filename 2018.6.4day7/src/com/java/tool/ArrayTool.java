package com.java.tool;
/*
    * 1,��ȡ���ֵ
	* 2,����ı���
	* 3,����ķ�ת
 */
class ArrayTool {
	
	//���һ���������еķ������Ǿ�̬�ģ���Ҫ�ڶ���һ����˽�й��췽����Ŀ�����������಻�����������
	//ֱ��������������
	private ArrayTool(){}
	
	//1,��ȡ���ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//2,����ı���
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//3,����ķ�ת
	public static void revArray(int[] arr){
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}
