package com.day.three;
/*
 ����һ�����ļ�������������·ݴ�ӡ��Ӧ�ļ���
 ������3��4��5
 �ļ���6��7��8
 �＾��9,10,11
 ������12,1,2 
 */

public class IfTest2 {//��������

	public static void main(String[] args) {//����������
		// TODO Auto-generated method stub
int month = 2;//��if else�����߼��������ʵ�����������뼾�ڵĶ�Ӧ
if(month<1||month>12)
	System.out.println(month+"û�ж�Ӧ�ļ���");
else if(month>=3 && month<=5)
System.out.println(month+"�¶�Ӧ���Ǵ���");
else if(month>=6 && month<=8)
System.out.println(month+"�¶�Ӧ�����ļ�");
else if(month>=9 && month<=11)
System.out.println(month+"�¶�Ӧ�����＾");
else 
System.out.println(month+"�¶�Ӧ���Ƕ���");
	}

}
