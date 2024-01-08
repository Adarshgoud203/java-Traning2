class Demo{
public void displayMenu()
{
System.out.println("+ :Adition");
System.out.println("- :Subraction\n* :Multiplcation");
System.out.println("/ :Division");
}
}
class Test{
public static void main(String args[]){
Demo b= new Demo();
b.displayMenu();
}
}