import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num= 0;

        // 한글자씩 나눠서 배열에 담기
        String binaryString = Integer.toString(n);
        int[] intArray = new int[binaryString.length()];

        for (int i = 0; i < binaryString.length(); i++) {
            intArray[i] = binaryString.charAt(i) - '0';
        }

        // 10진수 변환하기
        for(int i=0; i<intArray.length; i++){
            num = num*2 + intArray[i];   
        }
        System.out.print(num);
    }
}