import java.util.Scanner;
public class Armstrong {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d,count=0,a=0,c,e=0,sum=0;
		int g=n;
		int b=n;
		while(n!=0){
			count++;
			a=n%10;
			n=n/10;
			}
		while(g!=0){
			c=g%10;
			e=(int)Math.pow(c,count);
			sum=sum+e;
			g=g/10;
		}
		if(sum==b){
			
			System.out.println(sum);
		}
		
		else{
			System.out.println("no");
		}
	
	}
}
		
		
		
