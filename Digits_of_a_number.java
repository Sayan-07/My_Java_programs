import java.util.*;
public class Digits_of_a_number{
  public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int remainder,num1,count=0;
	num1=num;
	while(num1!=0){
		num1=num1/10;
		count++;
	}
	for(int i=count;i>=1;i--){
		int exp=(int)Math.pow(10,i-1);
		remainder=num%exp;
		num=num/exp;
		System.out.println(num);
		num=remainder;
	}
 }
}