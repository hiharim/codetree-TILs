import java.util.*;
import java.io.*;

public class Main {

    public static void printNumber(int n){
        if(n==0)
            return;
       
         for(int i=n; i>=1; i--){
            System.out.print(i+" ");
            
        }
         for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            
        }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }
}