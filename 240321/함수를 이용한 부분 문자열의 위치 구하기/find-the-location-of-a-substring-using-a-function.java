import java.util.*;
import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String input, pattern;

    public static boolean isSubStr(int startIdx){
        int n=input.length();
        int m = pattern.length();

        if(startIdx + m -1>=n)
            return false;
        
        for(int j=0; j<m; j++){
            if(input.charAt(startIdx+j) != pattern.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static int printIndex(){
        int n = input.length();
        for(int i=0; i<n; i++){
            if(isSubStr(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
        input = br.readLine();
        pattern = br.readLine();

        System.out.println(printIndex());

    }
}