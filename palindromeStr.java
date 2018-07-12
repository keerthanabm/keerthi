package test2;
import java.util.Scanner;
public class palindromeStr {
	public static void main(String args[]){
		String input1;
		String rev="";
		Scanner sc=new Scanner(System.in);
		input1=sc.nextLine();
	int i=0,j;
	char d;
		int len=input1.length();
		
		for(j=len-1;j>=0;j--){
		rev=rev+input1.charAt(j);	 
		}
	 
	if(input1.equals(rev)){	
	
		System.out.print("yes");
		}
	
		else
		{
			System.out.println("no");
		}
					
		
	}
	}
