import java.util.Scanner;
public class Swap1{
public static void main(String[]args){
		int a=10;
		int b=20;
		int c=30;
		System.out.println("before swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		a=a+b+c;
		b=a-(b+c);//60-(20+30);
		c=a-(b+c);//60-(10+30);
		a=a-(b+c);//60-(20+30);

		System.out.println("after swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println(a+" "+b+" "+c);
System.out.println(a+"\t"+b+"\t"+c);
System.out.println(a+"\n"+b+"\n"+c);





}
}


		

