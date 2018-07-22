import java.util.Scanner;
public class Stringapend {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String sb=sc.next();
	StringBuilder s=new StringBuilder(sb);
		s.append(".");
		System.out.println(s);
		}
	}
