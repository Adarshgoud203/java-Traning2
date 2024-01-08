import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
//Creating list using the ArrayList class
List <String> name=new ArrayList< >();
name.add("Animal");//add elements to the list 
name.add("Apple");   
name.add("Banana");
name.add("Bus");
System.out.println("List:"+name);

String names=name.get(3);
System.out.println("Accessed Element: "+names);

String removedNames=name.remove(1);
System.out.println("Removed Element: "+removedNames);
System.out.println("List:"+name);
}
}