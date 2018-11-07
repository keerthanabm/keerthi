import java.util.Scanner;
public class Swapevenodd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int i;
        int l=a.length();
        
        char b=0;
        if(l%2==0){
        for(i=0;i<l;i++){
            if(i%2==0){
            b=a.charAt(i+1);
                
        
            }
            else{
                b=a.charAt(i-1);
            }
                System.out.print(b);
        }
            
        }
        else{
            System.out.print("INVALID");
        }

    }
}
