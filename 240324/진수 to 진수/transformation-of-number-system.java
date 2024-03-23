import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_DIGIT =20;
    public static int[] a_digits = new int[MAX_DIGIT];
    public static int[] b_digits = new int[MAX_DIGIT];

    public static int a_cnt=0;
    public static int b_cnt=0;
    public static int num =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // a진수를 10진수로 변환
        String binaryString = Integer.toString(n);
        int[] intArray = new int[binaryString.length()];

        for (int i = 0; i < binaryString.length(); i++) {
            intArray[i] = binaryString.charAt(i) - '0';
        }
        for(int i=0; i<intArray.length; i++){
            num = num*a + intArray[i];   
        }


        // b진수로 변환
        while(true){
            if(num<b){
                b_digits[b_cnt++] = num;
                break;
            }
            
            b_digits[b_cnt++] = num%b;
            num/=b;
        }

        for(int i=b_cnt-1; i>=0; i--){
            System.out.print(b_digits[i]);
        }
    }
}