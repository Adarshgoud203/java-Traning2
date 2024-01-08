import java.util.Scanner;
class ArrayToMethod{
public int max(int [] arr){
int max=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>max){	max=arr[i];}//if
}//for
return max;
}//max
public int min(int[] array){
int min= array[0];
for(int i=0;i<array.length;i++) {
if(array[i]<min){	min=array[i]; }
}
return min;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array that is to be created:: ");
int size=sc.nextInt();
int[] myArray=new int[size];
System.out.println("Enter the elements of the array: ");
for(int i=0;i<size;i++) { myArray[i]=sc.nextInt(); }
ArrayToMethod m=new ArrayToMethod();
System.out.println("Maximun values in array is:: "+m.max(myArray));
System.out.println("Minimum values in the array is::"+m.min(myArray));
}
}


