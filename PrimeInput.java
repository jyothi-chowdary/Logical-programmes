import java.util.Scanner;
public class PrimeInput{
public static void main(String args[]){
boolean b=true;
 Scanner sc=new Scanner(System.in);
System.out.println("enter value:");
int a=sc.nextInt();
sc.close();
if(a<=1){
	b=false;
}
else{
	for(int i=2;i<=a/2;i++){
		if(a%i==0){
			b=false;
			break;
}}}
if(b){
	System.out.println(a+" is a prime number");
}
else{
	System.out.println(a+" is a not prime number");
}}}


 


