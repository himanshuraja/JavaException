public class ArrayBound {
public static void main(String args[]){
int array[]={20,20,20,20,20};
int num1=15,num2=10;
int result=10;
try{
result=num1/num2;
System.out.println("The result is " +result);
for (int i=5;i>=0;i--){
System.out.println(array[i]);
}}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("array is out of bound" +e);


}}}

