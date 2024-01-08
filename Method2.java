import java.util.Scanner;
class Demo{
public void displayMenu()
{
System.out.println("+ :Adition");
System.out.println("- :Subraction\n* :Multiplcation");
System.out.println("/ :Division");
}
public void mul(int a,int b)//with argument without return type
{
int res=a*b;
System.out.println(a+"*"+b+"="+res);
}
}
class Test{
public static void main(String args[]){
Demo b= new Demo();
b.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
b.mul(n1,n2);
}
}