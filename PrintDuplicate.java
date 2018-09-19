import java.util.Scanner;
  public class PrintDuplicate {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int i,j,count=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            count=0;
            for(j=i+1;j<n;j++){
                if((a[i]==a[j]) &&(i!=j)){
                   System.out.println(a[i]);
                    //count++;
                
                }
            
              
                       
               
               
               
            }
        }
             
        
    }
}
