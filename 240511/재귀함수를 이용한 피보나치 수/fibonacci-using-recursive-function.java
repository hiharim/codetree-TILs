import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);

        System.out.println(F(n));
    }

    public static int F(int n){
        if(n <= 2)
            return 1;
     

        return F(n-1) + F(n-2);        
    }
}