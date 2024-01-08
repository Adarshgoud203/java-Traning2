import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
//Creating list using the LinkedList class
List <Double> numbers=new LinkedList< >();
//add elements to the list 
numbers.add(10.00);
numbers.add(2.10);   
numbers.add(30.21);
numbers.add(10.35);
numbers.add(634.1);
numbers.add(6.4);
numbers.add(53.4);
numbers.add(854.00);
numbers.add(0.26);
numbers.add(52.0);
System.out.println("List:"+numbers);
//Access elements from the list
double number=numbers.get(2);
System.out.println("Accessed Element: "+number);

//Using the indexOf() method
double index1=numbers.indexOf(0.26);
double index2=numbers.indexOf(2.10);
System.out.println("Position of 0.26: " +index1);
System.out.println("Position of 2.10: " +index2);

//remove the elements from the list
double removedNumber=numbers.remove(1);
System.out.println("Removed Numbers: "+removedNumber);
}
}