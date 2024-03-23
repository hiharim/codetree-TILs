import java.util.*;
import java.io.*;

public class Main {
    public static int count=0;
    public static int works(int n){
        // int count=0;
        if(n==1){
            return count;
        }
        
        if(n%2==0){
            // 2로 나누기
            count++;
            return works(n/2);
        }else{
            // 3으로 나눈 몫
            count++;
            return works(n/3);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(works(n));
    }

}