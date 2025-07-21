import java.util.Scanner;
public class input5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number a:");
int a=sc.nextInt();
System.out.println("enter number b:");
int b=sc.nextInt();
System.out.println("enter number c:");
int c=sc.nextInt();
System.out.println("enter number d:");
int d=sc.nextInt();
System.out.println("enter number e:");
int e=sc.nextInt();
int largest=a;
if(a>largest)
largest=a;
if(b>largest)
largest=b;
if(c>largest)
largest=c;
if(d>largest)
largest=d;
if(e>largest)
largest=e;
System.out.println("the largest number:"+largest);
}
}