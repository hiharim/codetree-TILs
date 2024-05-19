import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 1;
        for(int i=0; i<3; i++){
            int number = Integer.parseInt(st.nextToken());
            sum *=number;
        }
        System.out.println(sumDigits(sum));
     
    }

    public static int sumDigits(int n){
        if(n<10)
            return n;

        int last = n%10;

        return last + sumDigits(n/10);
    }
}