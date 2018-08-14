import java.util.Scanner;
public class countnum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int s,count=0;
		while(a!=0){
			s=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);
	}

}
