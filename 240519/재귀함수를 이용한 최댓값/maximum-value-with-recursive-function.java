import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            numbers[i]= Integer.parseInt(st.nextToken());
        }
        
        System.out.println(F(numbers, n));
      
    }

    public static int F(int[] numbers,int n){
        if(n==0)
            return numbers[0];
        return Math.max(F(numbers, n-1), numbers[n-1]);
    }
}