import java.util.*;
class dp4 {
    public static void main(String[] args) {
        System.out.print("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=0;i<n;i++)System.out.println("@");
        for(i=0;i<n;i++){
            if(i==0){
                System.out.print("@");
                for(j=0;j<n;j++)System.out.print("*");
                
            }else{
            for(j=0;j<i*(n-1)+1 ;j++)System.out.print(" ");
            for(j=0;j<n;j++)System.out.print("*");
            if(i==n-1)System.out.print("@");}
            System.out.println();
            
        }
        for(i=0;i<n;i++){
            for(j=0;j<(n-1)*(n-1)+n+1 ;j++)System.out.print(" ");
            System.out.println("@");
            
        }
        
    
    }
}