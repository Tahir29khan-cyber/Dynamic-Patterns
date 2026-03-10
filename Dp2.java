import java.util.*;
class Dp2 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=0 ; i<n/2+1;i++){
            for(j=0; j<n+n/2-i;j++) System.out.print(" ");
            for(j=0;j<i*2+1;j++)System.out.print("*");
            System.out.println();
        }
        for(i=0; i<n/2+1;i++){
            for(j=0; j<n;j++)System.out.print(" ");
            System.out.print("*");
            for(j=0 ;j<n-2;j++)System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        for(i=0;i<n/2+1;i++){
            for(j=0;j<i;j++)System.out.print(" ");
            for(j=0;j<n-i*2;j++)System.out.print("*");
            if(i==0){
                System.out.print("@");
               for(j=0;j<n-2;j++)System.out.print(" ");
               System.out.print("@");
               for(j=0;j<n;j++)System.out.print("*");
               
            }
            else{
                for(j=0;j<i*2+n;j++)System.out.print(" ");
                for(j=0;j<n-i*2;j++)System.out.print("*");
            }
            System.out.println();
        }
    }
}