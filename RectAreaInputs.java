import java.util.Scanner;
public class RectAreaInputs{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter lenth:");
double l=sc.nextDouble();
System.out.println("enter breadth:");
double b=sc.nextDouble();
double result=l*b;
System.out.println("length:"+l);
System.out.println("breadth:"+b);
System.out.println("Area of Rectangle:"+result);
sc.close();
}
}



