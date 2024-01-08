//to change elements of the arraylist,we can use the set() method of the arraylist
import java.util.ArrayList;
class Main{
public  static void main(String args[]){
List <String> languages=new ArrayList<>();
//add elements in the  array list
languages.add("Java");
languages.add("Kotlin");
languages.add("c++");
languages.add("Python");
System.out.println("ArrayList: "+languages);
languages.set(2,"javaScript");
System.out.println("modified Arraylist:"+languages);
}}
