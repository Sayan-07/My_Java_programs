import java.util.*;
public class Fibonacci_till_n{
   public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	int limit=scn.nextInt();
	int num1=0,num2=1,count=0;
	System.out.println("The series is:");
	while(count<limit){
		System.out.println(num1);
		num1=num1+num2;
		num2=num1-num2;
		count++;  
  	}
 }
}