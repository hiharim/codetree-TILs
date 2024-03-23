import java.util.*;
import java.io.*;

public class Main {

    public static int f(int n){
        if(n<1){
            return 0;
        }

        return f(n/10)+(n%10)*(n%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(n));
    }
}