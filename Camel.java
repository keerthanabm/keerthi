import java.util.Scanner;
public class Camel {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
int i;
       String b=a.toLowerCase();
       char w=0,n,k;
       int q;
       char[] f=b.toCharArray();
      w=f[0];
      q=w-32;
      k=(char)q;
     System.out.print(k);
       int len=f.length;
       
        char p=0;
        int j;
        char z;
    for(i=0;i<len-1;i++){
        if(f[i]==' '){
            p=f[i+1];
            j=p-32;
            n=(char)j;
        
             }
        else{
            n=f[i+1];
        }
        
         System.out.print(n);
    }
        
       
        
   }
    }
