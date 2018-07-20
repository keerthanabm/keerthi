import java.util.Scanner;
public class numberdigit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		int count=0;
		while(n!=0){
			a=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
