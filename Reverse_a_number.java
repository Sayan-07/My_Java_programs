import java.util.*;
public class Reverse_a_number{
  public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int remainder;
	while(num>0){
		remainder=num%10;
		System.out.println(remainder);
		num=num/10;
  	}
  }
}