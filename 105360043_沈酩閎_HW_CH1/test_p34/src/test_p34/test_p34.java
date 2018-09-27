package test_p34;

import java.io.IOException;

public class test_p34 
{
	public static void main(String[] args)throws IOException
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1㎝num2贺笲衡:");
		System.out.println("num1+num2单"+(num1+num2));
		System.out.println("num1-num2单"+(num1-num2));
		System.out.println("num1*num2单"+(num1*num2));
		System.out.println("num1/num2单"+(num1/num2));
		System.out.println("num1%num2单"+(num1%num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("琌﹚ぇ患糤,┮b"+b);
		System.out.println("琌患糤ぇ﹚,┮c"+c);
	}
}
