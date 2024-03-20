import java.util.*;
import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String input,purpose;

    public static int printIndex(){
        int index =-100;
        
        if(!input.contains(purpose)){
            return -1;
        }else if(input.equals(purpose)){
            return 0;
        }
        
        for(int j=0; j<purpose.length(); j++){
            for(int i=0; i<input.length(); i++){
                if(purpose.charAt(j)==input.charAt(i)) {
                
                    index=purpose.length()>1 ? i-1 : i;
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