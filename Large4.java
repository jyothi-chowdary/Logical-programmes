public class Large4{
public static void main(String[]args){
 int a=1;
 int b=20;
int c=200;
int d=9;
int result=(a>b)?((a>c)?(a>d?a:d):(c>d?c:d)):((b>c)?(b>d?b:d):(c>d?c:d));
System.out.println("the greatest number is:"+result);
}
}