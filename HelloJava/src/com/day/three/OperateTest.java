package com.day.three;
//���󣺶�����������ֵ���л���������Ҫ�������������
public class OperateTest {
public static void main(String[] args) {
	int a = 3,b = 5;
	//System.out.println("a="+b+",b"+a);//����ֱ�����
	a = a^b;//a=3^5,Ҳ�����������������ɣ����������ڱ���
	b = a^b;//(3^5)^5=3
	a = a^b;//(3^5)^3=5
	System.out.println("a="+a+",b"+b);
}
}
