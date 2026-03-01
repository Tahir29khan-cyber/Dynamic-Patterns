import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter the odd no.");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i, j;
        
        for(i=0;i<n/2;i++){
            for(j=0;j<i*(n/2) ;j++) System.out.print(" ");
            for(j=0;j<n-(i*2) ; j++)
            {
            System.out.print("@");
          
            }
            System.out.println();
        }
        for(j=0;j<n/2+1 ; j++){
          System.out.print(" ");
        }
        System.out.print("@");
        System.out.print(" ");
        for(j=0;j<n;j++)
        {
        System.out.print("*");
        }
        System.out.println();
        
        for(i=0;i<n/2;i++){
            for(j=0;j<n/2-i ;j++)
            {
                System.out.print(" ");
            }
                System.out.print("*");
                for(j=0;j<i*n/2+(n-n/2);j++)
                {
                System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
        }
        for(i=0;i<n/2;i++){
          for(j=0;j<2*n-1;j++)
          if(j==0 || j==2*n-2){
          System.out.print("*");
          }
          else{
           System.out.print(" ");
          }
          System.out.println();
        }
    }
}
