import java.util.Scanner;
public class toggle {
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 String a=sc.next();
	 char[] b=a.toCharArray();
	 String s="";
	 int i,temp;
	 char d,m;
	 String v="";
	 for(i=0;i<b.length;i++){
	 if(b[i]>='A' && b[i]<='Z'){
		temp=(int)b[i]+32;
		d=(char)temp;
		v=String.valueOf(d);
	 }
	 else if(b[i]>='a' && b[i]<='z'){
			temp=(int)b[i]-32;
			m=(char)temp;
			v=String.valueOf(m);
		 }
	 System.out.print(v);
	 }
 }
}
	 
	 

