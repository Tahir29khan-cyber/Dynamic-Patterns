import java.util.*;
class dp5 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        if(n<1 || n%2==0){
          System.out.println("not valid");
          return;
        }
       for(i=0;i<1;i++){
           for(j=0;j<n-1;j++)System.out.print("e");
           for(j=0;j<n;j++)System.out.print(" ");
        //   for(j=0;j<1;j++)
           System.out.print("*");
           System.out.println();
       } 
       for(i=0;i<n;i++){
           for(j=0;j<n-2;j++)System.out.print(" ");
           for(j=0;j<1;j++)System.out.print("*");
           for(j=0;j<n;j++){
               if(i==n/2){
                   System.out.print("e");
               }
               else{
                   
                   System.out.print(" ");
               }
             
           }
           for(j=0;j<1;j++)System.out.print("*");
           for(j=0;j<n;j++){
               if(i==n/2){
                   System.out.print("e");
               }else{
                   System.out.print(" ");
               }
           }
              for(j=0;j<1;j++)System.out.print("*");
               System.out.println();
       }
       for(i=0;i<1;i++){
           for(j=0;j< 2*n-1;j++)System.out.print(" ");
           for(j=0;j<1;j++)System.out.print("*");
           for(j=0;j<n;j++)System.out.print(" ");
           for(j=0;j<n;j++)System.out.print("e");
           
       }
       
    }
}
