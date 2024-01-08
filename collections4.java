import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
//Creating list using the ArrayList class
List <Integer> numbers=new ArrayList< >();
numbers.add(21);//add elements to the list 
numbers.add(5);   
numbers.add(23);
System.out.println("List:"+numbers);

int number=numbers.get(2);
System.out.println("Accessed Element: "+number);

int removedNumber=numbers.remove(1);
System.out.println("Removed Element: "+removedNumber);
System.out.println("List:"+numbers);
}
}