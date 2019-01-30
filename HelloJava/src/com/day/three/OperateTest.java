package com.day.three;
//需求：对两个整数的值进行互换，不需要引入第三方变量
public class OperateTest {
public static void main(String[] args) {
	int a = 3,b = 5;
	//System.out.println("a="+b+",b"+a);//可以直接输出
	a = a^b;//a=3^5,也可以用异或运算来完成：异或的异或等于本身
	b = a^b;//(3^5)^5=3
	a = a^b;//(3^5)^3=5
	System.out.println("a="+a+",b"+b);
}
}
