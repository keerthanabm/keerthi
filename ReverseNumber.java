import java.util.Scanner;
public class ReverseNumber {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a,b;
	int r=0;
	while(n!=0){
	a=n%10;
	r=r*10+a;
	
	n=n/10;
	}
	System.out.println(r);
}
}
