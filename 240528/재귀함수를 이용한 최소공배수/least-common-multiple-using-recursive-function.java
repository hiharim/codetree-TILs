import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = findLcm(lcm, arr[i]);
        }

        System.out.println(lcm);
    }

    public static int findLcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static int gcd(int a, int b){
        int last = a%b;
        if(last ==0){
            return b;
        }
        return gcd(b, last);
    }

}