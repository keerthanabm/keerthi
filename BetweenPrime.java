import java.util.Scanner;
public class BetweenPrime {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int i,j,count=0;
		for(i=n;i<n1;i++){
			for(j=2;j<i;j++){
	    if(i%j==0){
	    	count=0;
	    	break;
	    }
	    else{
	    	count=1;
	    }
			}
	    if(count==1){
	    	
	    	System.out.println(i);
	    }
		
		}
	}

}
