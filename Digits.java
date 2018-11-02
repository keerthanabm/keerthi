import java.util.Scanner;
public class Digits {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int l=a.length();
        String b="";
        int num,i,k=0;
        for(i=0;i<l;i++){
            char s=a.charAt(i);
            
            if(Character.isDigit(s)){
            b=b+s;
            
        }
        
    }
    k=b.length();
    
    System.out.print(k);
}
}
