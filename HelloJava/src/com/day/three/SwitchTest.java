package com.day.three;
/*需求：用于指定一个月份，要根据用户指定的月份打印对应的季节
思路：用switch语句
case345对应春季
case678对应夏季
case9 10 11对应秋季
case 12 1 2对应冬季
default 表示没有对应的季节
*/
public class SwitchTest {//定义类名

	public static void main(String[] args) {//定义主函数
		// TODO Auto-generated method stub
int month = 2;//定义变量并初始化
switch(month) {
case 3:
case 4:
case 5:
	System.out.println(month+"月是春季");
	break;
case 6:
case 7:
case 8:
	System.out.println(month+"月是夏季");
	break;
case 9:
case 10:
case 11:
	System.out.println(month+"月是秋季");
	break;
case 12:
case 1:
case 2:
	System.out.println(month+"月是冬季");
	break;
	default:
	System.out.println("no sense");
}
	}

}
