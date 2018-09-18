import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] b=new int[n];
        int s=b.length;
        
        int i,m=1;
        for(i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
       
        if(s<=1){
             
            System.out.print(b[0]);
        }
        else{
        for(i=n-2;i<n;i++){
            System.out.print(b[i]);
        }
        for(i=0;i<=n-3;i++){
            System.out.print(b[i]);
        }
        }
        
    }
}
