package com.day.four;
 /* һ.���裺1.�������������к���
 * 				2.���ݵı仯���ɣ��е������Ժ������Ӻ����ֻ�ִ�е�������Ҳ�����ֹ��ɵĵ�����
 * 				����Ҫ��һ��Ƕ�׵�ѭ�����ʵ��
 * 				3.������֮��Ĺ�ϵ������С�ڵ�������
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
