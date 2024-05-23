import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());

        System.out.println(countNum(n));

    }

    public static int countNum(int n){
        if(n==1)
            return 0;


        if(n%2==0)
            return countNum(n/2)+1;
        else
            return countNum(3*n+1) +1;

    }
}