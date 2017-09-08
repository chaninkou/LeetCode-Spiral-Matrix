/*   
    Author: Chan In Kou
    Purpose: Review of Java: Primitive Parameters, String
*/
package lesson7;

public class Lesson7 {
	public static void main(String[] args)
	{	
		printString();
		System.out.println("-----------");
		parameters();
	}
	
	public static void printString(){
		int x = 100;
		String a = "Game";
		String b = a + " " + x;
		String c = b.substring(5,8);
		String d = "is cool";
		String e = b + " " + d;
		
		System.out.println("Practice of String");
		System.out.println("-----------");
		System.out.println("String a: " + a);
		System.out.println("String b: " + b);
		System.out.println("String c: " + c);
		System.out.println("String d: " + d);
		System.out.println("String e: " + e);
		
	}
	
	public static void parameters()
	{	
		System.out.println("Practice of Parameters");
		int a = 3;
		int b = 2;
		System.out.println("In 'parameters' a: " + a + " b: " + b);
		System.out.println("-------------------------------------");
		method1(a,b);
		System.out.println("-------------------------------------");
		System.out.println("In 'parameters' a: " + a + " b: " + b);
		System.out.println("-------------------------------------");
		method2(a,b);
		System.out.println("-------------------------------------");
		System.out.println("In 'parameters' a: " + a + " b: " + b);
	}
	
	public static void method1(int a, int b)
	{	System.out.println("In 'method1' a: " + a + " b: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("In 'method1' a: " + a + " b: " + b);
	}
	
	public static void method2(int a, int b)
	{	System.out.println("In 'method2' a: " + a + " b: " + b);
		a = a + b;
		b = 6;
		System.out.println("In 'method2' a: " + a + " b: " + b);
		method1(b,a);
		System.out.println("In 'method2' a: " + a + " b: " + b);	
	}
	
}
