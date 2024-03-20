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
        int small = 0;
        int big = 0;
        if(a>b){
            big = a;
            small = b;
        }else{
            big = b;
            small = a;
        }
    
        String result= new String(small+10+" "+big*2);
        return result;
    }
}