import java.util.Scanner;
public class large {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int d=a[0];
		for(i=1;i<n;i++){
			{
				if(d<a[i]){
					d=a[i];
				}
			}
		}
		System.out.println(d);
		
	}
}
