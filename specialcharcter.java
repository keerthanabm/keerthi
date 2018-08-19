import java.util.Scanner;
public class specialcharcter {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char[] d=a.toCharArray();
		char[] s={'!','@','#','$','%','^','&','*','(',')','.','?','/',':',';','+','_'};
		int i,j;
		int count=0;
		for(i=0;i<a.length();i++){
			for(j=0;j<s.length;j++){
				if(d[i]==s[j]){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
