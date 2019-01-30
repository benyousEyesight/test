package com.day.three;
/*
 需求：一年有四季，根据输入的月份打印对应的季节
 春季：3，4，5
 夏季：6，7，8
 秋季：9,10,11
 冬季：12,1,2 
 */

public class IfTest2 {//定义类名

	public static void main(String[] args) {//定义主函数
		// TODO Auto-generated method stub
int month = 2;//用if else语句和逻辑运算符，实现数字区间与季节的对应
if(month<1||month>12)
	System.out.println(month+"没有对应的季节");
else if(month>=3 && month<=5)
System.out.println(month+"月对应的是春季");
else if(month>=6 && month<=8)
System.out.println(month+"月对应的是夏季");
else if(month>=9 && month<=11)
System.out.println(month+"月对应的是秋季");
else 
System.out.println(month+"月对应的是冬季");
	}

}
