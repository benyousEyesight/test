package com.day.one;
/*需求：练习一个HelloWorld程序。
 	思路：
 	1.定义一个类，因为Java程序都定义在类中，java程序都是以类的形式存在，类的形式其实就是一个字节码文件最终体现。
 	2.定义一个主函数，为了让该类独立运行。
 	3.因为演示HelloWorld，在控制台上看到该字样，所以需要使用输出语句。
 	
 	步骤：
 	1.用class关键字来完成类的定义，并起一个阅读性强的类名。
 	2.主函数：public static void main(String[] args){}这个是固定格式， jvm会识别。
 	3.使用输出语句：System.out.println('Hello World')
 
 
 */

public class HelloWorld {//定义类名为HelloWorld

	public static void main(String[] args) {
		//定义一个主函数，为了保证该类的独立运行。
		// TODO Auto-generated method stub
System.out.println("Hello World");//这个是输出语句
	}

}
