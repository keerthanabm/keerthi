import java.util.Scanner;
public class squreroot {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=b*b;
		if(c==a){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
