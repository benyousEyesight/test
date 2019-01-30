package com.day.four;

/*需求：构建一个求和的函数，并在主函数中实现对该函数的调用*/

public class Function1 {
	
	public static void main(String[] args) {
		add(5, 6);//System.out.println("和为"+add(3, 5));//打印的功能应该放在函数里面
	}
	public static int add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("和为"+c);
		return c;
	}
}
