import java.util.Scanner;
public class divide{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        while(a>=b){
            a=a-b;
            c++;
        }
        System.out.print(c);
        
    }
}
