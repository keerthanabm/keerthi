import java.util.Scanner;
public class REVERSE{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String f=sc.next();
        
       
          String s=f.replaceAll("[aeiouAEIOU]","");
           StringBuffer g=new StringBuffer(s);
           String t=String.valueOf(g.reverse());
           System.out.println(t);
       

       
    }
}
