import java.util.Scanner;
public class As {
	public static void main(String argd[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int[] a=new int[n];
		int len=a.length;
		int[] c=new int[n];
		int i,b=0,j=0,k=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				}
		}	
		int h=len/2;
			for(k=0;k<len;i++){
				if(k==h){
		}
				System.out.println(a[k]);
			}
			}
		
		}
	
