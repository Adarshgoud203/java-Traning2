import java.util.Scanner;
class Demo{
public void displayMenu()
{
System.out.println("+ :Adition");
System.out.println("- :Subraction\n* :Multiplcation");
System.out.println("/ :Division");
}
public void add(int a,int b)//with argument no  return value function
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a,int b)//with argument return value function
{
int res=a-b;
return res;
}
public int input()//no argument with return value function
{
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
}
class Test{
public static void main(String args[]){
Demo b= new Demo();
b.displayMenu();n
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
b.add(n1,n2);
int r=b.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}