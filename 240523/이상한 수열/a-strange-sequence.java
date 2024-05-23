import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(printNumber(n));
    }

    public static int printNumber(int a){
        if(a==1)
            return 1;
        if(a==2)
            return 2;

        return printNumber(Math.abs(a/3)) + printNumber(a-1);
    }
}