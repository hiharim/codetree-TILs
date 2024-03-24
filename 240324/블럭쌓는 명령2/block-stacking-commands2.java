import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
       
        int[] blocks = new int[100];
        int a,b;
        
        for(int i=0; i<k; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            
            for(int j=a; j<=b; j++){
                blocks[j]+=1;
            }
        }

        // 최댓값
        int max = Arrays.stream(blocks).max().getAsInt();
        System.out.println(max);
       
    }
}