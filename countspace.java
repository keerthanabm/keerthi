import java.util.Scanner;
public class countspace {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=a.split(" ");
		int i,count=0;
		for(i=0;i<b.length;i++){
			count++;
		}
		System.out.println(count-1);
				
	}

}
