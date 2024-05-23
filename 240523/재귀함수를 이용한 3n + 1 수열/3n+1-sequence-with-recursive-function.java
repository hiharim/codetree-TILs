import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());

        System.out.println(F(n));

    }

    public static int F(int n){
        int cnt = 0;

        while(n>1){
            cnt++;   
            if(n%2==0)
                n=n/2;
            else
                n=3*n+1;
        }
       
        return cnt;
    }
}