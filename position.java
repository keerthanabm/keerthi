import java.util.Scanner;
public class position {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[a];
		int i;
		for(i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		for(i=0;i<a;i++){
			System.out.println(b[i]+" "+i);
		}
	}

}
