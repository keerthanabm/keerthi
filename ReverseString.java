import java.util.Scanner;
public class ReverseString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char[] ch=a.toCharArray();
		String h="";
		char f=0;
		int len=ch.length;
		int i;
		for(i=len-1;i>=0;i--){
		System.out.print(ch[i]);
		}
	}
}
