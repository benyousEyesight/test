package com.day.three;
/*��������ָ��һ���·ݣ�Ҫ�����û�ָ�����·ݴ�ӡ��Ӧ�ļ���
˼·����switch���
case345��Ӧ����
case678��Ӧ�ļ�
case9 10 11��Ӧ�＾
case 12 1 2��Ӧ����
default ��ʾû�ж�Ӧ�ļ���
*/
public class SwitchTest {//��������

	public static void main(String[] args) {//����������
		// TODO Auto-generated method stub
int month = 2;//�����������ʼ��
switch(month) {
case 3:
case 4:
case 5:
	System.out.println(month+"���Ǵ���");
	break;
case 6:
case 7:
case 8:
	System.out.println(month+"�����ļ�");
	break;
case 9:
case 10:
case 11:
	System.out.println(month+"�����＾");
	break;
case 12:
case 1:
case 2:
	System.out.println(month+"���Ƕ���");
	break;
	default:
	System.out.println("no sense");
}
	}

}
