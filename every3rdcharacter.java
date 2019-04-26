import java.util.Scanner;
public class every3rdcharacter  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int i;
        System.out.print(a.substring(0,1));
        for(i=1;i<a.length();i++){
            if(i%3==0){
                
        System.out.print(a.charAt(i));
            }
           
        }
        

    }
}
