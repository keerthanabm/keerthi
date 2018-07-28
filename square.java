import java.util.Scanner;
public class square {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a,b=0,c=0;
	while(n>0){
		a=n%10;
		b=b+a*a;
		n=n/10;
	}
	System.out.println(b);
}
}
