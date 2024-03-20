import java.util.*;
import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String input,purpose;

    public static int printIndex(){
        int index =-100;
        
        if(!input.contains(purpose)){
            return -1;
        }

        for(int i=0; i<input.length(); i++){
            for(int j=0; j<purpose.length(); j++){
                if(purpose.charAt(j)==input.charAt(i)){
                
                    index=i-1;
                }
            } 
        }
        return index;
    }

    public static void main(String[] args) throws IOException{
        input = br.readLine();
        purpose = br.readLine();

        System.out.println(printIndex());

    }
}