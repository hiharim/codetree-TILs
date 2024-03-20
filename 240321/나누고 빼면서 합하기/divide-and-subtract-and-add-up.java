import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] A;

    public static int isOdd(int num){
        if(num%2==0){
            // 짝수
            num =num/2;
        }else{
            // 홀수
            num =num-1;
        }
        return num;
    }

    public static int sumElement(int m){
        int result =A[m-1];
        int order= 0;
        while(m>1){
            order = isOdd(m);
            result +=A[order-1];
            m = order;

            if(m ==1){
             break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        
        A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println(sumElement(m));
    
    }
}