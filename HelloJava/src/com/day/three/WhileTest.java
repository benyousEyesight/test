package com.day.three;
/*需求：获取1-10，10个数字的和
 * 思路：
 * 1.每次参与加法的数值不确定。-------定义一个变量
 * 2.每次出现的和的数据也不确定。----------定义另一个变量
 * 3.参与加法运算的数值有递增规律。
 * 4.每一次都是加法运算在重复，并且都是和再加上下一个数值。
 * 步骤：
 * 1.定义一个变量，记录参与加法运算的数据。
 * 2.定义一个变量，记录每一次出现的和。
 * 3.对于记录参与加法运算的数据 --进行自增--。
 * 4.因为加法运算需要重发进行，故需循环结构。
 * 这是一个累加思想
 */
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 1;
int sum = 0;
while(x<11) {
	sum = sum+x;
	x++;
}
System.out.println("sum="+sum);
	}

}
