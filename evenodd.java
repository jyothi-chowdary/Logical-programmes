import java.util.Scanner;
public class evenodd{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter b value:");
int b=sc.nextInt();

 if(a%2==0){
System.out.println("even");
}
else{
 System.out.println("odd");
}
 sc.close();
}
}