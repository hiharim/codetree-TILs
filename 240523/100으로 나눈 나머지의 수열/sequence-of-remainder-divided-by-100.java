import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(printNumber(n));
    }

    public static int printNumber(int n){
        if(n==1)
            return 2;
        if(n==2)
            return 4;

        return (printNumber(n-1)*printNumber(n-2)) %100;
    }
}