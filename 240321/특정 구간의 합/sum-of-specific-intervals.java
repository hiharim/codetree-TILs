import java.util.*;
import java.io.*;

public class Main {
    public static int MAX_N =100;
    public static int[] A = new int[MAX_N+1];

    public static int sumArr(int a1, int a2){
        int total=0;
        for(int i= a1; i<=a2; i++){
            total +=A[i-1];
        }
        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        
        int a = 0;
        int b = 0;
        while(m>0){
            a= sc.nextInt();
            b = sc.nextInt();
            
            sumArr(a,b);

            if(m==0){
                break;
            }
            m--;
        }

    }
}