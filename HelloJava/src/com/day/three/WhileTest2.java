package com.day.three;
/*����1-100֮��6�ı������ֵĴ���
 * ˼·��
 * 1.1-100����ÿ�γ��ֵ���ֵ��ȷ����
 * 2.6�ı������ֵĴ���Ҳ��ȷ����
 * 3.1-100֮����ֵ����е������ɡ�
 * 4.1-100֮��������γ��֣���6�����������ͻ��¼һ�Ρ�
 *���裺
 *1.����һ����������¼����ȡ����������ݡ�
 *2.����һ����������¼6�ı������ֵĴ�����
 *3. �Բ���ȡ����������ݽ�������
 *4.ÿ������һ��6�ı����ͻ��¼һ�Σ��������һֱ�ظ���ֱ������ȡ��
 *		��������ѭ���ṹ��
 *������˼��
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
