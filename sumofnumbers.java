import java.util.Scanner;
public class sumofnumbers {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int i,sum=0;
		int[] a=new int[b];
		for( i=0;i<b;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
