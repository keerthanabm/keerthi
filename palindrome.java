import java.util.Scanner;
public class palindrome {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,a=0,t=0;
		temp=n;
		while(n!=0){
			a=n%10;
			t=t*10+a;
			n=n/10;
			}
		if(temp==t){
			
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}

}
