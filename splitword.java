import java.util.Scanner;
public class splitword {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
String[] a=s.split("");
		int i;
		int count=0;
		for(i=0;i<a.length;i++){
			if(a[i].equals(".")){
				count++;
			}
		}
		System.out.println(count+1);
	}

}
