import java.util.*;
class dp6 {
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
            for(j=0;j<(2*n+1)-i;j++)System.out.print(" ");
            for(j=0;j<2*i+1;j++)System.out.print("*");
            System.out.println();
        }
        for(i=0;i<n;i++){
            if(i==0){
                for(j=0;j<n+n/2;j++)System.out.print("@");
                for(j=0;j<(n*2-1)-(i*2);j++)System.out.print("*");
            }else{
                for(j=0;j<n+n/2+i;j++)System.out.print(" ");
                 for(j=0;j<(n*2-1)-(i*2);j++)System.out.print("*");
            }
            System.out.println();
        }
    }
}

