import java.util.Scanner;
public class nearest {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int s;
		if(a%2==0){
			s=a;
		}
		else{
			s=a-1;
		}
		System.out.println(s);
	}

}
