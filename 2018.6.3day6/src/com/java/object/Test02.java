package com.java.object;
/*
 * 匿名对象应用场景
	* a:调用方法，仅仅只调用一次的时候。
		* 那么，这种匿名调用有什么好处吗?
			* 节省代码 
		* 注意：调用多次的时候，不适合。匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
	* b:匿名对象可以作为实际参数传递
 */
public class Test02 {

	public static void main(String[] args) {
		/*Car c1 = new Car();
		/*c1.color = "red";
		c1.num = 4;
		c1.run();
		method(c1);
		
		Car c2 = new Car();		//造多辆车，代码复用性太差。
		c2.color = "red";
		c2.num = 4;
		c2.run();
		method(c2);	*/	
	
		new Car().run();
		
		method(new Car());		//匿名对象可以当作参数传递
		method(new Car());
		method(new Car());

		
	}
	//抽取方法提高代码的复用性！！！
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
		System.out.println("一辆" + color + "的,"+ num  + "车，在跑");
	}
}