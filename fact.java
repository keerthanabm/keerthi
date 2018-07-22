import java.util.Scanner;
public class fact {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=1,i;
	if(n<20){
		for(i=1;i<=n;i++){
		d=d*i;
	}
	}
	System.out.println(d);
}
}
