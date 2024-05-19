import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        System.out.println(F(n));

    }

    public static int F(int n){
        if(n==0)
            return 1;
        if(n==1) 
            return 1;

        return n * F(n-1);
    }
}