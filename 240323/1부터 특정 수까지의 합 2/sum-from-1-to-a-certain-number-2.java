import java.util.*;
import java.io.*;

public class Main {

    public static int fact(int n){
        
        return n*(n+1)/2;
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}