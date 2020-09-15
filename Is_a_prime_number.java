import java.util.*;
public class Is_a_prime_number{
  public static void main(String[] args){
 	System.out.print("Enter input::");
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	for(int i=0;i<t;i++){
  		int n=scn.nextInt();
		int c=0;
		for(int j=2;j*j<=n;j++){
			if(n%j==0){
				c++;
				break;
      			}
    		}
		if(c==0){
			System.out.println("Prime");
		}
		else{
			System.out.println("not Prime");	
		}
		
  }
 }
}