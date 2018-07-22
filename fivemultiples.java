import java.util.Scanner;
public class fivemultiples {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=0,i;
	for(i=1;i<=n;i++){
		d=n*i;
		System.out.println(d);
		}
}
}
