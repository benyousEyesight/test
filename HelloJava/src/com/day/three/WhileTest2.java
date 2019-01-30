package com.day.three;
/*需求：1-100之间6的倍数出现的次数
 * 思路：
 * 1.1-100个数每次出现的数值不确定。
 * 2.6的倍数出现的次数也不确定。
 * 3.1-100之间出现的数有递增规律。
 * 4.1-100之间的数依次出现，是6的整数倍，就会记录一次。
 *步骤：
 *1.定义一个变量，记录参与取余运算的数据。
 *2.定义一个变量，记录6的倍数出现的次数。
 *3. 对参与取余运算的数据进行自增
 *4.每当出现一次6的倍数就会记录一次，这个动作一直重复，直到数据取完
 *		（所以用循环结构）
 *计数器思想
 * */

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 1;
int counter = 0;
while(x<101) {
	if(x%6==0) 
		counter++;
	System.out.println("x="+x);
	x++;
}
System.out.println("counter="+counter);
	}

}
