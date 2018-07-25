import java.util.Scanner;
public class NAD {
	public static void main(String args[]){
		Scanner sc=new Scanner(System. in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int c;
		c=(n-1);
		int f=d*c;
		int h=(2*a)+f;
		int m=(h*n)/2;
		System.out.println(m);
	}

}
