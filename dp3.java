import java.util.*;
class dp3 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=0;i<n/2;i++){
           for(j=0;j<=i;j++) System.out.print("*");
            for(j=0;j<(n-1)-i*2;j++) System.out.print(" ");
           for(j=0;j<=i;j++) System.out.print("*");
           
           System.out.println();
        }
        for(j=0;j<n+1;j++) System.out.print("*");
        System.out.println();
        for(i=0;i<n/2;i++){
            for(j=0;j<n/2-i;j++)System.out.print("*");
            for(j=0;j<i*2+n/4 ;j++)System.out.print(" ");
            for(j=0;j<n/2-i;j++)System.out.print("*");
            System.out.println();
        }
    }
}
