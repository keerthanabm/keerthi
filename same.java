import java.util.Scanner;
public class same {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int len=Integer.valueOf(String.valueOf(a).length());
		
		int[] b=new int[len];
		int c,i,j,sum=0;
		while(a!=0){
			c=a%10;
			sum=sum+c;
		a=a/10;
		}
		System.out.println(sum);
		}
	}


