import java.util.Scanner;
public class prime {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int count=0;
		for(i=2;i<n;i++){
			if(n%i==0){
				count++;
				break;
			}
		}
			if(count==0){
				
				System.out.println("Yes");
			}
			else{
				System.out.println("no");
			}
			 
		

	}

}
