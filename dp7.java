import java.util.*;
class dp7 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i,j;
        if(n<=1 || n%2==0){
           System.out.print("invalid no."); 
           return;
        }
       for(i=0;i<n-1;i++){
           for(j=0;j<(n-1)-i;j++)
           if(i==0){
               System.out.print("");
           }else{
               System.out.print(" ");
           }
           for(j=0;j<i*2+1;j++)System.out.print("@");
           System.out.println();
       }
       for(i=0;i<n;i++){
           for(j=0;j<n/2+1;j++){
               if(j>=n/2-i && j>=i-n/2){
                   System.out.print("*");
               }
              
           }
           if(i==n/2){
                //  for(j=0;j<1;j++)
                 System.out.print("@");
             }else
                 System.out.print(" ");
             
             for(j=0;j<n/2+1;j++){
                 if(j>=n/2-i && j>=i-n/2){
                     System.out.print("*");
                 }else{
                    System.out.print("  "); 
                 }
             }
               System.out.println();
       }
    }
}

