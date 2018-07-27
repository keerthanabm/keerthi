import java.util.Scanner;
public class nonduplicate {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
		int count=0;
			for(j=0;j<n;j++){
			if(a[i]==a[j]){
		count++;
			}
		}
			if(count==1){
				System.out.println(a[i]);
			}
			}
	}

}
