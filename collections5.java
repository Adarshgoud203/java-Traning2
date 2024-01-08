import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
//Creating list using the LinkedList class
List <Integer> numbers=new LinkedList< >();
//add elements to the list 
numbers.add(10);
numbers.add(20);   
numbers.add(30);
System.out.println("List:"+numbers);
//Access elements from the list
int number=numbers.get(2);
System.out.println("Accessed Element: "+number);

//Using the indexOf() method
int index=numbers.indexOf(20);
System.out.println("Position of 20: "+index);

//remove the elements from the list
int removedNumber=numbers.remove(1);
System.out.println("Removed Numbers: "+removedNumber);
}
}