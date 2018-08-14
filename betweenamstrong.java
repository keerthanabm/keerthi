import java.util.Scanner;
public class betweenamstrong {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int count=0;
	int i,c=0,d,sum=0,e;
	for(i=a+1;i<b;i++){
		count=0;
		e=i;
		while(e!=0){
			e=e/10;
			count++;
		}
		c=0;
		int s=i;
		while(s!=0){
			d=s%10;
			c=c+(int)Math.pow(d,count);
		    s=s/10;
		}
		if(c==i)
			System.out.println(i);
		}
}
}
