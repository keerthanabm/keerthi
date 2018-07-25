import java.util.Scanner;
public class Sum1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[n];
		int i,j;
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(j=0;j<b.length;j++){
			b[j]=sc.nextInt();
		}
		int count=0;                             
		for(i=0;i<a.length;i++){
			
			for(j=0;j<b.length;j++){
				if(a[i]==b[j]){
					count++;
				}
			}
		}
		if(count>1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
