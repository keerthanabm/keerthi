import java.util.Scanner;
public class power {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int i,b=1;;
	for(;a!=0;a--){
		b=b*n;
	}
	System.out.println(b);
}
}
