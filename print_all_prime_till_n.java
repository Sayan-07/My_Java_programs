import java.util.*;
public class print_all_prime_till_n{
 public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter lower limit:");
	int low=scn.nextInt();
	System.out.print("Enter lower limit:");
	int high=scn.nextInt();
	for(int i=low;i<=high;i++){
		int c=0;
		for(int j=2;j*j<=i;j++){
			if(i%j==0){
			   c++;
			   break;
			}
		}
		if(c==0){
			System.out.println(i);
		}
	}
 


}
}