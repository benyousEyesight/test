package com.day.four;
 /* 一.步骤：1.变量有两个，行和列
 * 				2.数据的变化规律：行递增完以后，列增加后，行又会执行递增且列也呈现又规律的递增。
 * 				故需要有一个嵌套的循环语句实现
 * 				3.行与列之间的关系，列数小于等于行数
 * */

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
draw(9,9);
	} 
public static void draw(int row,int col) {
	for(int x=1;x<=row;x++) {
		for(int y=1;y<=x;y++) {
			System.out.print(x+"*"+y+" =x*y"+" "+"\t");
		}
		System.out.println();
	}
	
}
}
