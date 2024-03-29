import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]); 
        int b = Integer.parseInt(input[1]); 

        String result = solution(a,b);
        System.out.println(result);
    
    }
     public static String solution(int a, int b){
        // a 와 b 를 순서대로 출력해야함
        int first = a;
        int second = b;
        if(a>b){
            first= a*2;
            second = b+10;
        }else{
            first= a+10;
            second = b*2;
        }
        String result= first+" "+second;

        return result;
    }
}